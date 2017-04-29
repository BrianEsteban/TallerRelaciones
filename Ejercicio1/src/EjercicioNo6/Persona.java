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
public class Persona {
    private String nombrePersona;
    private String idPersona;
    private ArrayList<Mascota> mascotas;

    public Persona(String nombrePersona, String idPersona) {
        this.nombrePersona = nombrePersona;
        this.idPersona = idPersona;
        this.mascotas = new ArrayList<>();
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
    
    public void mostrarMascotas (Mascota m){
        
        System.out.println("Nombre: " + m.getMnombre() + "  Color de pelaje: " + m.getColorPelaje() + "  ID: " + m.getId());
    }
    
}
