/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio25;

import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     * 
     * Sabiendo que necesito 2 bolsas de cal y 3 de cemento para una pared de 1
     * metro cuadrado, se pide el alto y ancho y se informa la cantidad de cada
     * material que necesito.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String datoAux;
       Double ancho;
       Double alto;
       Double total;
       Double totalCal;
       Double totalCemento;
       
       Scanner Misc= new Scanner(System.in);
      
        System.out.println("Indique el ancho: ");
        datoAux= Misc.next();
        ancho= Double.parseDouble(datoAux);
        
        System.out.println("Indique el alto :");
        datoAux= Misc.next();
        alto= Double.parseDouble(datoAux);
        
        total= (ancho*alto);
        totalCal= (total*2);
        totalCemento= (total*3) ;
        
        System.out.println("La cantidad total que se necesita son "+totalCal+" de cal y "+totalCemento+" de cemento.");
        
        
        
        
        
        
    }
    
}
