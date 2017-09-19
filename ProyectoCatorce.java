/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocatorce;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ProyectoCatorce {

    /**
     * @param args the command line arguments
     * se pide ingresar una clave,si es "utn750"se mostrara el mensaje bienvenidos,de lo contrario el mensaje clave erronea
     * quince:se ingresa un inporte si supera los cien pesos se le suma un veintitres porciento si en menos a 100 peoso
     * 16:se ingresa el inporte de un pasaje de avion y el mes de viaje,si es enero se le descuenta unm dies porciento por temporada baja
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String datoAux;
        String Clave;
        Scanner msc= new Scanner(System.in);
        
        
        System.out.println("ingrese la clave");
        Clave = msc.next();
        Boolean respuesta;
        
        if (Clave.equals("utn750"))
            System.out.println("bienvenidos");
        else  
            System.out.println("clave erronea"); }
    
    
    }
    

    

