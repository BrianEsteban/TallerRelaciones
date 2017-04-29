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
public class Sala {
    private ArrayList <Semana> semanas = new ArrayList();

    public Sala() {
    }

    public ArrayList<Semana> getSemanas() {
        return semanas;
    }

    public void setSemanas(ArrayList<Semana> semanas) {
        this.semanas = semanas;
    }
    
    public void añadirSemana(Semana semanas){
        this.semanas.add(semanas);
    }
    
    public void eliminarSemanas(Semana semanas){
        this.semanas.remove(semanas);
    }

    @Override
    public String toString() {
        return  semanas + "\n";
    }
    
    
}
