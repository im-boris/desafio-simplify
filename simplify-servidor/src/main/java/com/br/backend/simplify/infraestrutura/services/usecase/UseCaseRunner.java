package com.br.backend.simplify.infraestrutura.services.usecase;

import com.br.backend.simplify.adapters.arquitetura.IIntegracao;
import com.br.backend.simplify.adapters.arquitetura.IUseCaseRunner;
import com.br.backend.simplify.infraestrutura.arquitetura.UseCaseMapper;
import com.br.backend.simplify.pojo.negocio.contexto.Contexto;
import com.br.backend.simplify.pojo.negocio.requisicao.Requisicao;
import com.br.backend.simplify.pojo.negocio.resposta.Resposta;
import com.br.backend.simplify.adapters.arquitetura.IUseCase;
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
    public <R extends Resposta> R run(Requisicao requisicao) throws Exception {

        UseCaseMapper useCase = getUseCase(requisicao);
        IUseCase beanUseCase = getUseCaseBean(useCase);
        Contexto contextoUseCase = useCase.getContexto();
        Resposta respostaUseCase = useCase.getResposta();

        contextoUseCase.setRequisicao(requisicao);
        respostaUseCase.setContexto(contextoUseCase);

        disparaFluxo(beanUseCase, contextoUseCase, respostaUseCase);

        return (R)respostaUseCase;

    }

    private UseCaseMapper getUseCase(Requisicao requisicao) {
        return UseCaseMapper.findById(requisicao.getCodigoRequisicao());
    }

    private IUseCase getUseCaseBean(UseCaseMapper useCase) {
        return applicationContext.getBean(useCase.getUseCase().getClass());
    }

    private void disparaFluxo(IUseCase useCase, Contexto contexto, Resposta resposta) throws Exception {

        useCase.preExecuta(contexto);
        integracaoService.executaIntegracoesPreExecucao(contexto, useCase);

        useCase.execucao(contexto);

        integracaoService.executaIntegracoesPosExecucao(contexto, useCase);
        useCase.posExecuta(contexto);

        useCase.preencheResposta(contexto, resposta);

    }

}