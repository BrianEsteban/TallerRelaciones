/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioNo2;

/**
 *
 * @author BRIAN
 */
public class Tipo {
    private String codigo;

    public Tipo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Tipo{" + "codigo=" + codigo + '}';
    }
    
    

}
