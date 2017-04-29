/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioNo1;

import java.util.Arrays;

/**
 *
 * @author BRIAN
 */
public class Carro {
    private Rueda[] ruedas = new Rueda[4]; 
    private int contador;
    private String placa;
    private Motor motor;
    private Chasis chasis;
    

    public Carro(String placa){
        this.placa = placa;
        this.chasis = new Chasis("Ref-212", "Independent");
        this.contador = 0;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda rs){
        if(this.contador<5){
            this.ruedas [contador]= rs;
            this.contador++;
        }
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    @Override
    public String toString() {
        return "\n" + "ruedas:" + Arrays.toString(ruedas) + "\n" + "placa:" + placa + "\n" + "motor:" + motor + "\n" + "chasis:" + chasis + "\n";
    }
     
    
}
