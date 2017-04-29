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
public class Rueda {
    private int diametro;
    private String marcaRueda;

    public Rueda(int diametro, String marcaRueda) {
        this.diametro = diametro;
        this.marcaRueda = marcaRueda;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public String getMarcaRueda() {
        return marcaRueda;
    }

    public void setMarcaRueda(String marcaRueda) {
        this.marcaRueda = marcaRueda;
    }

    @Override
    public String toString() {
        return "Rueda{" + "diametro:" + diametro + ", marca de la rueda" + marcaRueda + '}';
    }

}
