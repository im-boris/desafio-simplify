package com.br.backend.simplify.infraestrutura.services.integracao;

import com.br.backend.simplify.arquitetura.DefinicaoIntegracao;
import com.br.backend.simplify.arquitetura.IIntegracao;
import com.br.backend.simplify.arquitetura.IUseCase;
import com.br.backend.simplify.arquitetura.IntegracaoFluxo;
import com.br.backend.simplify.pojo.contexto.Contexto;
import com.br.backend.simplify.pojo.integracao.IntegracaoEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class IntegracaoService implements IIntegracao {

    @Autowired
    private ApplicationContext context;


    @Override
    public void executa(Contexto contexto, IntegracaoEnum integracaoEnum) {
        IntegracaoFluxo integracao = (IntegracaoFluxo) context.getBean(integracaoEnum.getNome());
        integracao.executa(contexto);
    }

    @Override
    public void executaIntegracoes(Contexto contexto, IntegracaoEnum[] integracoes) throws Exception {
        if(Objects.nonNull(integracoes)) {
            for (IntegracaoEnum i : integracoes) {
                String nome = i.getNome();
                IntegracaoFluxo integracao = (IntegracaoFluxo) context.getBean(nome);
                integracao.executa(contexto);
            }
        }
    }

    public void executaIntegracoesPreExecucao(Contexto contexto, IUseCase useCaseBean) throws Exception {
        if(useCaseBean.executaIntegracoesPreExecucao(contexto)) {
            executaIntegracoes(contexto, this.getAnnotation(useCaseBean).preExecucao());
        }
    }

    public void executaIntegracoesPosExecucao(Contexto contexto, IUseCase useCaseBean) throws Exception {
        if(useCaseBean.executaIntegracoesPosExecucao(contexto))
            executaIntegracoes(contexto, this.getAnnotation(useCaseBean).posExecucao());
    }

    private DefinicaoIntegracao getAnnotation(IUseCase useCase) {
        DefinicaoIntegracao annotation = findAnnotationInHierarchy(useCase.getClass());
        if (annotation == null)
            throw new RuntimeException("Annotation não presente");

        return annotation;
    }

    // Procura recursiva até o pai de todos em busca da annotation 'DefinicaoIntegracao'
    private DefinicaoIntegracao findAnnotationInHierarchy(Class<?> clazz) {
        if (clazz == null || clazz == Object.class) {
            return null;
        }

        if (clazz.isAnnotationPresent(DefinicaoIntegracao.class)) {
            return clazz.getAnnotation(DefinicaoIntegracao.class);
        }

        return findAnnotationInHierarchy(clazz.getSuperclass());
    }

}
