/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioNo2;

import java.util.Date;

/**
 *
 * @author BRIAN
 */
public class Main {
    public static void main(String[] args) {
        
        Date fechaDeCreacion = new Date(115,1,1);
        Date fechaDeCreacion2 = new Date(115,3,11);
        
        Cuenta c = new Cuenta(54231, 3500000, fechaDeCreacion, "Brian");
        Cuenta c2 = new Cuenta(54744, 1500000, fechaDeCreacion2, "Javier");
        
        Banco b = new Banco("Ref-427904054");
        b.añadirCuenta(c);
        b.añadirCuenta(c2);
        
        b.listar();
               
    }
    
}
