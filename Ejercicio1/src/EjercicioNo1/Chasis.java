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
public class Chasis {
    private String referencia;
    private String marca;

    public Chasis(String referencia, String marca) {
        this.referencia = referencia;
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "referencia:" + referencia + ", marca:" + marca;
    }
    
}
