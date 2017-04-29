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
public class Movimientos {
    private Date fecha;
    private double balanceAnterior;
    private double cantidad;
    private Tipo tipo;

    public Movimientos(Date fecha, double balanceAnterior, double cantidad, Tipo tipo) {
        this.fecha = fecha;
        this.balanceAnterior = balanceAnterior;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }
    
    public double getBalanceAnterior() {
        return balanceAnterior;
    }

    public void setBalanceAnterior(double balance) {
        this.balanceAnterior = balance;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "fecha=" + fecha + ", balanceAnterior=" + balanceAnterior + ", cantidad=" + cantidad + ", tipo=" + tipo ;
    }

    

}
