/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animales;

import javax.swing.JOptionPane;

/**
 *
 * @author Pc
 */
public class Animales {

    String nombre;
    String Sexo;
    String Tipo;
    int Correr;
    

    public void Comer() {
        nombre = JOptionPane.showInputDialog("Nombre del Animal:");
    }

    ;
    public void Correr() {
        Correr=Integer.parseInt(JOptionPane.showInputDialog("Su Km/h es:"));
    }
;
    public void tipo(){
        Sexo=JOptionPane.showInputDialog("Que genero es el Animal:");
        Tipo=JOptionPane.showInputDialog("Es carnivoro o herbiboro:");
        
    };
    public void MostrarDatos(){   
       JOptionPane.showMessageDialog(null, "El " + nombre + " esta corriendo a "+Correr+"Km/h"+"\nEl " + nombre+ " es " +Tipo+"\nEl " + nombre + " esta comiendo");
    }
}
