package com.example.exptestjunit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

import static org.junit.Assert.*;
public class CalculetteTest {
    Instant inst;
    Operations op;
    @BeforeClass
    public void setUpClass()
    {
        //du code à exécuter une fois au début de la classe de test
    }
    @Before
    public void setUp() throws Exception {
        inst=Instant.now();
        //du code à exécuter à chaque opération de test (méthode)
        op = new Operations();
    }

    @After
    public void tearDown() throws Exception {
        Instant endInst = Instant.now();
        long duration = Duration.between(inst, endInst).toMillis();

    }

    @Test
    public void add() {
        int res= op.add(1,8);
        assertEquals(9,res);
    }
    public void addNegatif() {
        int res= op.add(-1,-8);
        assertEquals(-9,res);
    }

    @Test
    public void multiply() {
        int res =op.multiply(2,9);
        assertEquals(18,res);
    }

}