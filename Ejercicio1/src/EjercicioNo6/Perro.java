/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioNo6;

/**
 *
 * @author BRIAN
 */
public class Perro extends Mascota{
    private String raza;

    public Perro(String raza, String id, String nombre, String colorPelaje) {
        super(id, nombre, colorPelaje);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String Sonido() {
        return "guau";
    }    
    
}
