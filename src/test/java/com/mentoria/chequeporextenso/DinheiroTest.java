package com.mentoria.chequeporextenso;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DinheiroTest {

    @Test
    void teste1() {
        Dinheiro umReal = new Dinheiro(1);
        assertEquals("Um real", umReal.escreverPorExtenso());

    }
}