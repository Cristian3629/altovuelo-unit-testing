package com.despegar.altovuelo;

import com.despegar.altovuelo.classTest.Pila;
import org.junit.Test;

import static org.junit.Assert.*;

public class PilaTest {


    @Test(expected = IllegalStateException.class)
    public void NoSePuedeRemoverDePilaVacia(){
        Pila pila = new Pila<>();
        pila.pop();
    }

    @Test(expected = IllegalStateException.class)
    public void testMetoYSacoUnElemento(){
        Pila pila = new Pila<>();
        pila.push(1);
        assertEquals(pila.pop(),1);
        assertEquals(pila.size(),0);
        pila.pop();
    }


    @Test
    public void testMetoDosElementosDistintos(){
        Pila<String> pila = new Pila<>();
        pila.push("1");
        pila.push("2");
        pila.push(null);
        assertEquals(pila.pop(),null);
        assertEquals(pila.pop(),"2");
        assertEquals(pila.pop(),1);
    }
}