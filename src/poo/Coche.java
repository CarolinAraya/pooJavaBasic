/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 *
 * @author _caro
 */
public class Coche {

    //Atributos
    String color;
    String marca;
    int km;

    //Métodos
    public static void main(String[] args) {
        Coche coche1 = new Coche();

        coche1.color = "Amarillo";
        coche1.marca = "Mazda";
        coche1.km = 32;

        System.out.println("El color de tu coche es: " + coche1.color);
        System.out.println(" La marca de tu coche es: " + coche1.marca);
        System.out.println("El kilometraje de tu coche es: " + coche1.km);
    }
}
