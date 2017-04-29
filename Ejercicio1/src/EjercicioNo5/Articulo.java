/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioNo5;

/**
 *
 * @author BRIAN
 */
public class Articulo extends DomainObject{
    
    private String nombreArticulo;
    private double costoUnidad;
    private Producto product;

    public Articulo(String nombreArticulo, double costoUnidad, String _id) {
        super(_id);
        this.nombreArticulo = nombreArticulo;
        this.costoUnidad = costoUnidad;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public double getCostoUnidad() {
        return costoUnidad;
    }

    public void setCostoUnidad(double costoUnidad) {
        this.costoUnidad = costoUnidad;
    }
  
}
