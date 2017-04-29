/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioNo4;

/**
 *
 * @author BRIAN
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anyo;
    private String nombreDia;
    private String nombreMes;

    public Fecha(int dia, int mes, int anyo, String nombreDia, String nombreMes) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
        this.nombreDia = nombreDia;
        this.nombreMes = nombreMes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public String getNombreDia() {
        return nombreDia;
    }

    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }

    public String getNombreMes() {
        return nombreMes;
    }

    public void setNombreMes(String nombreMes) {
        this.nombreMes = nombreMes;
    }
    

    public void añoBisiesto(int año){
        
    }

    @Override
    public String toString() {
        return "{" + "dia:" + dia + ", mes:" + mes + ", año:" + anyo + ", nombre del dia:" + nombreDia + ", nombre del mes:" + nombreMes + '}';
    }

    
}
