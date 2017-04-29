/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioNo1;

import java.util.ArrayList;

/**
 *
 * @author BRIAN
 */
public class Persona {

    private ArrayList <Carro> carros = new ArrayList();
    
    public void añadirCarro(Carro carro){
        carros.add(carro);
    }
    
    public void removerCarro (Carro carro){
        carros.remove(carro);
    }
   
    public Carro getCarro(int index){
        return (Carro) carros.get(index);
    }
    
    public int getCuentaCarro(){
        return carros.size();
    }
    
    public ArrayList getCarros() {
        return carros;
    }

    public void setCarros(ArrayList carros) {
        this.carros = carros;
    }

    @Override
    public String toString() {
        return "Persona:" + "\n" + "carros:" + carros;
    }
    
    
}
