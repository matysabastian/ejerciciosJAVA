/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejrciciodos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjrcicioDos {

    /**
     * @param args the command line arguments
     * sedebe pedir un nombre y sedebe mostrar el mismo nombre
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Nombre;
        Scanner MiEscaner=new Scanner(System.in);
        System.out.println("Ingrese Nombre");
        Nombre=MiEscaner.nextLine();
        System.out.println("el nombre ingresado" + "matias");    }
    
}
