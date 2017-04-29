/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioNo3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author BRIAN
 */
public class Semana {
    private int numero;
    private Dia[] diasLaborados = new Dia[5];
    private int contador;
    private ArrayList <Sala> salas= new ArrayList();

    public Semana(int numero) {
        this.numero = numero;
        this.contador = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Dia[] getDiasLaborados() {
        return diasLaborados;
    }

    public void setDiasLaborados(Dia diasLaborados) {
        if(this.contador<5){
            this.diasLaborados[contador]=diasLaborados;
            this.contador++;
        }
    }
    
    public void añadirSala(Sala sala){
        this.salas.add(sala);
    }
    
    public void eliminarSala(Sala sala){
        this.salas.remove(sala);
    }

    @Override
    public String toString() {
        return "Semana numero:" + numero + ", diasLaborados:" + Arrays.toString(diasLaborados) + ", salas:" + salas + "\n";
    }
   
    
}
