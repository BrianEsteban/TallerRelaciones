/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioNo3;

import java.util.ArrayList;
/**
 *
 * @author BRIAN
 */
public class Programacion {
    private ArrayList <Sala> salas = new ArrayList();

    public Programacion() {
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }
    
     public void añadirSala(Sala salas){
        this.salas.add(salas);
    }
    
    public void eliminarSala(Sala salas){
        this.salas.remove(salas);
    }

    @Override
    public String toString() {
        return "Programacion:" + "\n" + salas ;
    }

}
