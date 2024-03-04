package org.example.utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplexNumberTest {

    @Test
    void complexNumberConstructorTest(){
        ComplexNumber cn = new ComplexNumber(1.0, 2.5);
        assertEquals(cn.getReal(), 1.0);
        assertEquals(cn.getImg(), 2.5);
    }

    @Test
    void complexNumberSetterTest(){
        ComplexNumber cn = new ComplexNumber(1.0, 2.5);
        cn.setReal(-1.2);
        cn.setImg(2.8);
        assertEquals(cn.getReal(), -1.2);
        assertEquals(cn.getImg(), 2.8);
    }

    @Test
    void complexNumberModulusTest(){
        ComplexNumber cn = new ComplexNumber(3.0, 4.0);
        assertEquals(cn.modulus(), 5.0);
    }

    @Test
    void complexNumberAddTest(){
        ComplexNumber cn1 = new ComplexNumber(1.0, 2.5);
        ComplexNumber cn2 = new ComplexNumber(-2.0, 1.3);
        ComplexNumber cn3 = cn1.add(cn2);
        assertEquals(cn3.getReal(), -1.0);
        assertEquals(cn3.getImg(), 3.8);
    }

    @Test
    void complexNumberSubtractTest(){
        ComplexNumber cn1 = new ComplexNumber(1.0, 2.5);
        ComplexNumber cn2 = new ComplexNumber(-2.0, 1.3);
        ComplexNumber cn3 = cn1.subtract(cn2);
        assertEquals(cn3.getReal(), 3.0);
        assertEquals(cn3.getImg(), 1.2);
    }


}
