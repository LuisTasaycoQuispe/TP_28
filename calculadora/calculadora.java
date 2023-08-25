/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB_1
 */
public class calculadora {

    int num1;
    int num2;
    double sum, rest, mul, div,res;

    public void sumar() {
        sum = num1 + num2;
    }

    public void restar() {
        rest = num1 - num2;

    }

    public void multiplicacion() {
        mul = num1 * num2;

    }

    public void division() {
        div = num1 / num2;

    }
    public void residuo(){
        res = num1%num2;
    }
    public void ingresarDatos() {
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte un numero "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte un numero "));

    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "suma: " + sum + "\nresta: " + rest + "\nmultiplicacion: " + mul + "\ndivision: " + div+"\nresiduo de la division: "+ res);
    }

}
