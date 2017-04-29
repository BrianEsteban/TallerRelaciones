/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioNo4;

/**
 *
 * @author BRIAN
 */
public class Main {
    public static void main(String[] args) {
        
        Fecha fec = new Fecha(15,11,1968,"Jueves","Noviembre");
        Persona Hernan = new Persona();
        Hernan.setFechaNacimiento(fec);
        
        Fecha fec2 = new Fecha(03,11,1970,"Jueves","Noviembre");
        Persona Martha = new Persona();
        Martha.setFechaNacimiento(fec2);
        
        System.out.println(Hernan.toString());
        System.out.println(Martha.toString());
    }
    
}
