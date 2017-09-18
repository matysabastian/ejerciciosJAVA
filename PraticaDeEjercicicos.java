/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica.de.ejercicicos;

import java.util.Scanner;

/**
 *
 * @author pcandcel
 */
public class PraticaDeEjercicicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroUno;
        int numeroDos;
        int numeroTres;
        int suma;
        Scanner entradaporteclado= new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        numeroUno = entradaporteclado.nextInt();
        System.out.println("ingrese el segudo numero");
        numeroDos=entradaporteclado.nextInt();
        System.out.println("ingrese el tercer numero");
        numeroTres= entradaporteclado.nextInt();
        suma=numeroUno+numeroDos+numeroTres;
        System.out.println("la suma es:"+suma);
        
    }
    
}
