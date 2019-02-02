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
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //Métodos
    //Método para digitar número
    public void leerNumero(int numero1, int numero2) {
        suma = numero1 + numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero: "));

    }

    public void suma(int numero1, int numero2) {
        suma = numero1 + numero2;
        System.out.println("La suma es:" + suma);
    }

    public void dividir(int numero1, int numero2) {
        division = numero1 / numero2;
        System.out.println("La división es:" + division);
    }

    public void restar(int numero1, int numero2) {
        resta = numero1 - numero2;
        System.out.println("La resta es:" + resta);
    }

    public void multiplicar(int numero1, int numero2) {
        multiplicacion = numero1 * numero2;
        System.out.println("La multiplicación es:" + multiplicacion);
    }
}
