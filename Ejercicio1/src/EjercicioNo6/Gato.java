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
public class Gato extends Mascota{
    private boolean cazador;

    public Gato(boolean cazador, String id, String nombre, String colorPelaje) {
        super(id, nombre, colorPelaje);
        this.cazador = cazador;
    }

    public boolean isCazador() {
        return cazador;
    }

    public void setCazador(boolean cazador) {
        this.cazador = cazador;
    }
    
    @Override
    public String Sonido(){
        return "Mauuu";
    }
    
}
