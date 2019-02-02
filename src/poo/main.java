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
public class main {

    public static void main(String[] args) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        Operaciones op = new Operaciones();
        
        int suma = op.suma(n1, n2);
        int resta = op.restar(n1, n2);
        int multiplicacion = op.multiplicar(n1, n2);
        int division  = op.dividir(n1, n2);
        
        op.mostrarResultados(suma, resta, division, multiplicacion);
    }

}
