/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB_1
 */
public class Principal {

    public static void main(String[] args) {
        
        calculadora C1 =new calculadora();
        
        C1.ingresarDatos();
        C1.sumar();
        C1.restar();
        C1.multiplicacion();
        C1.division();
        C1.residuo();
        C1.mostrarDatos();
    }
}
