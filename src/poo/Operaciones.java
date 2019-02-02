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

    //Métodos
    //Método para digitar número
    public int suma(int numero1, int numero2) {
        int suma = numero1 + numero2;
        return suma;
    }

    public int dividir(int numero1, int numero2) {
        int division = numero1 / numero2;
        return division;
    }

    public int restar(int numero1, int numero2) {
        int resta = numero1 - numero2;
        return resta;
    }

    public int multiplicar(int numero1, int numero2) {
        int multiplicacion = numero1 * numero2;
        return multiplicacion;
    }

    public void mostrarResultados(int suma, int resta, int division, int multiplicacion) {
        System.out.println("la suma es: " + suma);
        System.out.println("la resta es: " + resta);
        System.out.println("la division es: " + division);
        System.out.println("la multiplicacion es: " + multiplicacion);

    }
}
