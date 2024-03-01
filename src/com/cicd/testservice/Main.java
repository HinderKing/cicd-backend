package com.cicd.testservice;

import com.cicd.utils.ComplexNumber;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i<10000; i++) {
            ComplexNumber cn = new ComplexNumber(i, i+1);
            System.out.println(cn.modulus());
            try{
                sleep(10000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
