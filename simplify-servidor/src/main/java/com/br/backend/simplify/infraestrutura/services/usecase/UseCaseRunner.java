package com.br.backend.simplify.infraestrutura.services.usecase;

import com.br.backend.simplify.arquitetura.IIntegracao;
import com.br.backend.simplify.arquitetura.IUseCase;
import com.br.backend.simplify.arquitetura.IUseCaseRunner;
import com.br.backend.simplify.infraestrutura.arquitetura.UseCaseMapper;
import com.br.backend.simplify.pojo.contexto.Contexto;
import com.br.backend.simplify.pojo.requisicao.Requisicao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UseCaseRunner implements IUseCaseRunner {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private IIntegracao integracaoService;


    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public <C extends Contexto> C run(Requisicao requisicao) throws Exception {

        UseCaseMapper useCase = getUseCase(requisicao);
        IUseCase beanUseCase = getUseCaseBean(useCase);
        Contexto contextoUseCase = useCase.getContexto();
        contextoUseCase.setRequisicao(requisicao);
        disparaFluxo(beanUseCase, contextoUseCase);

        return (C)contextoUseCase;

    }

    private UseCaseMapper getUseCase(Requisicao requisicao) {
        return UseCaseMapper.findById(requisicao.getCodigoRequisicao());
    }

    private IUseCase getUseCaseBean(UseCaseMapper useCase) {
        return applicationContext.getBean(useCase.getUseCase().getClass());
    }

    private void disparaFluxo(IUseCase useCase, Contexto contexto) throws Exception {

        useCase.preExecuta(contexto);
        integracaoService.executaIntegracoesPreExecucao(contexto, useCase);

        useCase.execucao(contexto);

        integracaoService.executaIntegracoesPosExecucao(contexto, useCase);
        useCase.posExecuta(contexto);

    }

}
