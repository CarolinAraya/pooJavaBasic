/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import javax.swing.JOptionPane;

/**
 *
 * @author _caro
 */
public class Operaciones {

    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //Métodos
    //Método para digitar número
    public void leerNumero() {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero: "));

    }

    public void suma() {
        suma = numero1 + numero2;
    }

    public void dividir() {
        division = numero1 / numero2;
    }

    public void restar() {
        resta = numero1 - numero2;
    }

    public void multiplicar() {
        multiplicacion = numero1 * numero2;
    }

    public void mostrarResultados() {
        System.out.println("La suma es:" + suma);
        System.out.println("La división es:" + division);
        System.out.println("La resta es:" + resta);
        System.out.println("La multiplicación es:" + multiplicacion);

    }
}
