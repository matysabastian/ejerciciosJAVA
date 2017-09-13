/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocinco;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioCinco {

    /**
     * @param args the command line arguments
     * se nesesita pedir dos numeros y sumarlos, mostrar el resultado
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("estoy en el ejercicio Cinco");
        int numeroUno;
        int numeroDos;
        int suma;
        Scanner entradaporteclado =new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        numeroUno=entradaporteclado.nextInt();
        System.out.println("ingrese el segundo numero");
        numeroDos=entradaporteclado.nextInt();
        suma=numeroUno + numeroDos;
        System.out.println("la suma es " + suma);
        
                
    }
    
}
