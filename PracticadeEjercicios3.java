/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicadeejercicios3;

import java.util.Scanner;

/**
 *
 * @author pcandcel
 */
public class PracticadeEjercicios3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroUno;
        int numeroDos;
        int resta;
        Scanner entradaporteclado=new Scanner(System.in);
        System.out.println("ingrese el primer numero ");
        numeroUno=entradaporteclado.nextInt();
        System.out.println("ingrese el segundo numero");
        numeroDos=entradaporteclado.nextInt();
        resta=numeroUno-numeroDos;
        System.out.println("la resta es"+resta);
        
    }
    
}
