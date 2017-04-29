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
public class Motor {
    private String marcaMotor;
    private double modelo;
    private double cab_fuerza;

    public Motor(String marcaMotor, double modelo, double cab_fuerza) {
        this.marcaMotor = marcaMotor;
        this.modelo = modelo;
        this.cab_fuerza = cab_fuerza;
    }

    public String getMarcaMotor() {
        return marcaMotor;
    }

    public void setMarcaMotor(String marcaMotor) {
        this.marcaMotor = marcaMotor;
    }

    public double getModelo() {
        return modelo;
    }

    public void setModelo(double modelo) {
        this.modelo = modelo;
    }

    public double getCab_fuerza() {
        return cab_fuerza;
    }

    public void setCab_fuerza(double cab_fuerza) {
        this.cab_fuerza = cab_fuerza;
    }

    @Override
    public String toString() {
        return "marca del motor:" + marcaMotor + ", modelo:" + modelo + ", caballos  de fuerza:" + cab_fuerza;
    }
    
}
