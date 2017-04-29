/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioNo1;

/**
 *
 * @author BRIAN
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              
        Rueda r = new Rueda(45,"Michelin");
        Rueda r2 = new Rueda(45, "Williams");
        
        Motor m = new Motor("Mclaren", 2015, 423);
        Motor m2 = new Motor("Mercedes-Benz", 2106, 450);
      
        Carro c1 = new Carro("MLY-775");
        Carro c2 = new Carro("JKJ-118");
                
        c1.setMotor(m);
        c2.setMotor(m2);
        
        c1.setRuedas(r);
        c1.setRuedas(r);
        c1.setRuedas(r);
        c1.setRuedas(r);
        
        c2.setRuedas(r2);
        c2.setRuedas(r2);
        c2.setRuedas(r);
        c2.setRuedas(r);
        
        Persona p1 = new Persona();
        p1.añadirCarro(c1);
        p1.añadirCarro(c2);
        
        
        System.out.println(p1.toString());
    }
    
}
