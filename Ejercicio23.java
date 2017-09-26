/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio23;

import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     * Debemos pedir el ancho y el largo de un terreno e informar cuantos metros
     * de alambre necesitamos para dar tres (3) vueltas de alambre.
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        
       String datoAux;
       Double ancho;
       Double largo;
       Double total;
       
       Scanner Misc= new Scanner(System.in);
       
        System.out.println("Indique el ancho del terreno: ");
        datoAux= Misc.next();
        ancho= Double.parseDouble(datoAux);
        
        System.out.println("Indique el largo del terreno: ");
        datoAux= Misc.next();
        largo= Double.parseDouble(datoAux);
        
        total= (ancho*largo)* 3;
        
        System.out.println("Los metros necesarios para dar 3 vueltas de alambre"
                + " son: "+total +" metros");
        
       
       
    }
    
    
}
