package com.despegar.altovuelo;

import com.despegar.altovuelo.classTest.Anagrama;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramaTest {

    Anagrama anagrama;

    @Test
    public void testAnagramaMasDeUnaLetra(){

        //Ejecutar(Act)
        boolean result = anagrama.isAnagrama("roma","amor");
        //Evaluar(Assert)
        assertTrue("roma y amor deben ser anagramas",result);

    }


    @Before
    public void before(){
        anagrama = new Anagrama();
        System.out.println("Método before");
    }


    @Test
    public void testPalabraMayusculaYPalabraMinusculaSonAnagramas(){
       boolean result = anagrama.isAnagrama("AMOR","amor");
        assertTrue("Amor es anagrama de amor",result);
    }

    @Test
    public void testPalabrasConCaracteres(){
        boolean result = anagrama.isAnagrama("@|@|·|@·|@","@|@|·|@·|@");

        assertTrue("Palabras con caracteres especiales",result);
    }

    @Test
    public void testPalabrasConTildes(){
       boolean result = anagrama.isAnagrama("ááá","ááá");
       assertTrue("Las palabras iguales con tildes son iguales",result);
    }



}