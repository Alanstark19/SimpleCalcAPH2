package com.example.android.SimpleCalc;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(JUnit4.class)
public class CalculatoreTest {
    //objeto calculator
    private Calculator mCalculator;
    //inicializando el objeto
    @Before
    public void setUp(){
        mCalculator = new Calculator();
    }
    @Test
    public void addTwoNumbers(){
        //llamar al método y el resultado que me retorne
        //a través de una aserción que espera un true o false

        //se utiliza la aserción que te dice si se cumple que el valor esperado sea
        //el resultado obtenido
        //se quiere saber si el resultado regresa el valor correcto

        double resultAdd = mCalculator.add(2.0,3.0);
        assertThat(resultAdd, equalTo(5.0));
    }
}//fin de la clase