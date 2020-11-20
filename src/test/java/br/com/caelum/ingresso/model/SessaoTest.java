package br.com.caelum.ingresso.model;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;

import org.junit.Assert;
import org.junit.Test;

public class SessaoTest {

    @Test
    public void oPrecoDaSessaoDeveSerIgualASomaDoPrecoDaSalaMaisOPrecoDoFilme() {
        Sala sala = new Sala("Imax", new BigDecimal("22.50"));
        Filme filme = new Filme("Rogue One", Duration.ofMinutes(120), "SCI-FI", new BigDecimal("12.00"));
        Sessao sessao = new Sessao(LocalTime.parse("10:00:00"), filme, sala);

        BigDecimal somaManual = sala.getPreco().add(filme.getPreco());

        Assert.assertEquals(somaManual, sessao.getPreco());
    }

}