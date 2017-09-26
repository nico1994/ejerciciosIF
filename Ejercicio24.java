/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio24;

import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     *Debemos pedir el ancho, el largo de un terreno y la cantidad de hilos de
     *alambre e informar cuantos metros de alambre necesitamos para completar
     *las vueltas de alambre.
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String datoAux;
       Double ancho;
       Double largo;
       Double hilos;
       Double total;
       
       Scanner Misc= new Scanner(System.in);
       
        System.out.println("Indique el ancho del terreno: ");
        datoAux= Misc.next();
        ancho= Double.parseDouble(datoAux);
        
        System.out.println("Indique el largo del terreno: ");
        datoAux= Misc.next();
        largo= Double.parseDouble(datoAux);
        
        System.out.println("Indique la cantidad de alambre : ");
        datoAux= Misc.next();
        hilos= Double.parseDouble(datoAux);
        
        total= (((ancho*largo)*3)- hilos);
        
        System.out.println("Para completar las vueltas de alambre se necesita : "+total);
       
    }
    
}
