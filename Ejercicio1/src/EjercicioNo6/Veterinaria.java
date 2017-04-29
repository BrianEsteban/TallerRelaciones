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
public class Veterinaria {
    private ArrayList <Mascota> pets;

    public Veterinaria() {
        pets = new ArrayList<>();
    }

    public ArrayList<Mascota> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Mascota> pets) {
        this.pets = pets;
    }
    
    public void añadirMascota (Mascota m){
        this.pets.add(m);
    }
    
    public void removerMascota (Mascota m){
        this.pets.remove(m);
    }
    
    public void mostrarMascotasTipo (String tipo){
        for(Mascota m: this.pets){
        if(m instanceof Perro && tipo.equals("Perro")){
                System.out.println("Perro:");
                System.out.println("Color del pelaje:" + ((Perro) m).colorPelaje  + "   Raza:" + ((Perro) m).getRaza() + "   Sonido:" + m.Sonido() + "\n");
        }
        if(m instanceof Gato && tipo.equals("Gato")){
                System.out.println("Gato:");
                System.out.println("Cazador?:" + ((Gato) m).isCazador() + "   Sonido:" + m.Sonido() + "\n");
        }
        if(m instanceof Hamster && tipo.equals("Hamster")){
                System.out.println("Hamster:");
                System.out.println("Peso:" + ((Hamster) m).getPeso() + "   Sonido:" + m.Sonido() + "\n");
        }
        }
    }
    
    public void mostrarMascotass(Mascota m){
        
        System.out.println("Nombre:" + m.getMnombre() + "   Color del pelaje:" + m.getColorPelaje() + "   ID:" + m.getId());
        
    }
    
}
