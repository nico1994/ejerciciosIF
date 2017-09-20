/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto17;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Proyecto17 {

    /**
     * @param args the command line arguments
     * Se pide una edad y se informa si es niño adolescente o mayor de edad
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner misc= new Scanner(System.in);
        Integer edad;
        //
        System.out.println("Ingrese edad: ");
        edad= misc.nextInt();
        
       if (edad>18)
       {System.out.println("Es mayor de edad");}
       
       if (edad <=12)
       {System.out.println("Es niño");}
        
       if ((12 < edad ) && ( edad<18 ))
               
       {System.out.println("Usted es adolescente");}
       
       /** Forma optima(mejor programado)
        * if (edad>18)
       {System.out.println("Es mayor de edad");}
       
       if (edad <12)
       {System.out.println("Es niño");}
       * 
       else
       {System.out.println("Usted es adolescente");}
        * 
        */
     
      
      
           
        
    }
    
}
