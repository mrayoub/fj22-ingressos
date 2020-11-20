package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

public class DescontoParaEstudantes implements Desconto {

    public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
        return precoOriginal.multiply(new BigDecimal("0.5"));
    }

    public String getDescricao() {
        return "Desconto de Estudante";
    }

}
