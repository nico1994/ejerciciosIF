/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio22;

import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     * se ingresa una nota, si es 10 mostrar excelente, si esta entre 9 y 4 
     * mostrar aprobó , de lo contrario mostrar “ la próxima será” .
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String datoAux;
        Double nota;
        
        Scanner misc= new Scanner(System.in);
        
        System.out.println("Ingrese nota: ");
        datoAux= misc.next();
        nota= Double.parseDouble(datoAux);
        
        if(nota==10)
        {System.out.println("Exelente");}
        if ((nota< 9) && ( nota > 4))
        System.out.println("Aprobó");
        else 
            System.out.println("La proxima será"); }   
            
       
        
        
    }
    

