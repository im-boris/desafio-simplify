package com.br.backend.simplify.arquitetura;

import com.br.backend.simplify.pojo.integracao.IntegracaoEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DefinicaoIntegracao {
    IntegracaoEnum[] preExecucao() default {};
    IntegracaoEnum[] posExecucao() default {};
}
