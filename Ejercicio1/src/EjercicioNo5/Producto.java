/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioNo5;

import java.util.ArrayList;

/**
 *
 * @author BRIAN
 */
public class Producto extends DomainObject{
    
    private String nombreProducto;
    private String descripcionProducto;
    private ArrayList <Articulo> articulos;
    private Categoria category;

    public Producto(String nombreProducto, String descripcionProducto, String _id) {
        super(_id);
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        articulos = new ArrayList<>();
        
        Articulo item = new Articulo("Chocolatina", 3600, "HB");
        this.articulos.add(item);
        Articulo item2 = new Articulo("Fruta", 800, "V");
        this.articulos.add(item2);
        Articulo item3 = new Articulo("Botella de agua", 1800, "Crl");
        this.articulos.add(item3);
        Articulo item4 = new Articulo("Cuaderno", 2000, "Norm");
        this.articulos.add(item4);
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        this.articulos = articulos;
    }
    
    public void añadircategoria(Categoria c){
         this.category =new Categoria(c.getNombreCategoria(),c.getDescripcionCategoria(),c.getId());
    }

}
