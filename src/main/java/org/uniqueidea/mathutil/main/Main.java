/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uniqueidea.mathutil.main;

import org.uniqueidea.mathutil.core.MathUtil;

/**
 *
 * @author lequa
 */
public class Main {

    public static void main(String[] args) {//psvm
       // crt space tìm trong jdk , class
        System.out.println("Hi this app build with maven");
       tryTDDFirst();
    }
    public static void tryTDDFirst(){
        //tc #1
        // n = 0 => 1 ? 
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        //sai ham vua viet
         //so sanh 2 gia tri
        System.out.println("0! Status | excpected = " + expected + "| Actual" + actual);
    }

    
}
