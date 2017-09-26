/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio27;

import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     * para una pileta se necesita saber la superficie, se debe pedir que tipo
     * de pileta tiene (cuadrada o redonda) de ser redonda, pedir el radio y si
     * es cuadrada pedir el largo y 
     * el ancho, mostrar la superficie de la pileta.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String datoAux;
        String tipo;
        Double radio;
        Double largo;
        Double ancho;
        Double resultadoCuadrada;
        
        Scanner Misc= new Scanner(System.in);
        
        System.out.println("Qué tipo de pileta tiene?");
        tipo= Misc.next();
        
        if (tipo.equals("redonda"))
        {System.out.println("Indique el radio: ");
        datoAux= Misc.next();
        radio= Double.parseDouble(datoAux);
        
        radio= 3.14*(radio*radio);
        
        System.out.println("la superficie de la pileta es : "+radio);}
        
        if (tipo.equals("cuadrada"))
                
        {System.out.println("Indique el largo: ");
        datoAux= Misc.next();
        largo= Double.parseDouble(datoAux); 
        
        System.out.println("Indique el ancho: ");
        datoAux= Misc.next();
        ancho= Double.parseDouble(datoAux); 
        
        resultadoCuadrada= (largo*ancho);
        
            System.out.println("La superficie es de la pileta es : "+resultadoCuadrada);}
        
             
               
    }}
        
        
        
   
    
