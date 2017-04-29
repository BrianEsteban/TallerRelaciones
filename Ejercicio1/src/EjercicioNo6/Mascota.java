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
public abstract class Mascota {
    protected String id;
    protected String mnombre;
    protected String colorPelaje;

    public Mascota(String id, String mnombre, String colorPelaje) {
        this.id = id;
        this.mnombre = mnombre;
        this.colorPelaje = colorPelaje;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMnombre() {
        return mnombre;
    }

    public void setMnombre(String mnombre) {
        this.mnombre = mnombre;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }
    
    public abstract String Sonido();

    
}
   
   
   

