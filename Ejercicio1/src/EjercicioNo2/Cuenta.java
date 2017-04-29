/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioNo2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author BRIAN
 */
public class Cuenta {
    private int numeroCuenta;
    private double balanceActual;
    private Date fechaCreacion;
    private String nombreCliente;
    private ArrayList <Movimientos> movimientos;

    
    public Cuenta(int numeroCuenta, double balanceActual, Date fechaCreacion, String nombreCliente) {
        this.numeroCuenta = numeroCuenta;
        this.balanceActual = balanceActual;
        this.fechaCreacion = fechaCreacion;
        this.nombreCliente = nombreCliente;
        this.movimientos = new ArrayList<>();
        
        Tipo t = new Tipo("3.32");
        Date fecha = new Date(117,2,15);
        Movimientos mov = new Movimientos(fecha, 150000.00, 15, t);
        
        Tipo t2 = new Tipo("3.2");
        Date fecha2 = new Date(117,2,21);
        Movimientos mov2 = new Movimientos(fecha2, 150000.00, 15, t2);
        
        this.movimientos.add(mov);
        this.movimientos.add(mov2);        
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getBalanceActual() {
        return balanceActual;
    }

    public void setBalanceActual(double balanceActual) {
        this.balanceActual = balanceActual;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public ArrayList getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList movimientos) {
        this.movimientos = movimientos;
    }
    
    public void añadirMovimietos(Movimientos m){
        movimientos.add(m);
    }
    
    public void removerMovimientos (Movimientos m){
        movimientos.remove(m);
    }
   
    public Movimientos getMovimietos(int index){
        return (Movimientos) movimientos.get(index);
    }
    
    public int getCuentaMovimientos(){
        return movimientos.size();
    }
    public double consignarDinero(double valor){
        double saldo=0;
        saldo+=valor;
        return saldo;
    }
    
    public double retirarDinero(double valor){
        double saldo=1000000;
        if(saldo>0 && saldo>valor){
            saldo-=valor;
        }
        return saldo;
    }

    
    
}
