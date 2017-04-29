/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioNo6;

import java.util.ArrayList;

/**
 *
 * @author BRIAN
 */
public class Main {
    public static void main(String[] args) {
            Veterinaria vet = new Veterinaria();
            
            administrarVeterinaria(vet,"s");
            vet.mostrarMascotasTipo("Perro");
            vet.mostrarMascotasTipo("Gato");
            vet.mostrarMascotasTipo("Hamster");

    }
    
    public static void leerMascotas(Veterinaria v) {
        
    }
    
    public static void administrarVeterinaria(Veterinaria v, String s) {
            ArrayList <Persona> personas = new ArrayList<>();
            
            Persona p1 = new Persona ("Brian", "103065888888");
            Persona p2 = new Persona ("Osmar", "105441111");
            
            personas.add(p1);
            personas.add(p2);
            
            Perro dog = new Perro ("Bull dog", "x", "Oliver", "Gris");
            Perro chi = new Perro ("Chihuahua", "y", "Sullivan", "cafe");
            v.añadirMascota(dog);
            v.añadirMascota(chi);
            
            Gato cat = new Gato (false, "x2", "Isis", "Dorado");
            v.añadirMascota(cat);
            
            Hamster ham = new Hamster (1.2, "x3", "Herbie", "Amarillo");
            v.añadirMascota(ham);
          
            v.mostrarMascotass(ham);
            v.mostrarMascotass(cat);
            v.mostrarMascotass(dog);
            v.mostrarMascotass(chi);
                                   
    }
    
}
