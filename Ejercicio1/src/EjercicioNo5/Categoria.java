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
public class Categoria extends DomainObject{
    
    private String nombreCategoria;
    private String descripcionCategoria;
    private ArrayList <Producto> productos;

    public Categoria(String nombreCategoria, String descripcionCategoria, String _id) {
        super(_id);
        this.nombreCategoria = nombreCategoria;
        this.descripcionCategoria = descripcionCategoria;
        productos = new ArrayList<>();
        
        Producto product = new Producto("Hershey", "Blanca", "HB2");
        this.productos.add(product);
        Producto product2 = new Producto("Manzana", "Verde", "V2");
        this.productos.add(product2);
        Producto product3 = new Producto("Cristal", "Purificada", "C4");
        this.productos.add(product3);
        Producto product4 = new Producto("Cuaderno Norma", "Cuadriculado", "Nomr2");
        this.productos.add(product4);
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void listar(){
        int j=0;
        for(Producto p : this.productos){
            j++;
            System.out.println("Nombre: " + p.getNombreProducto());
            System.out.println("Descripcion: " + p.getDescripcionProducto());
            System.out.println("Id: " + p.getId() + "\n");
            
            int i=0;
            
            while(i<p.getArticulos().size() && j==this.productos.size()){
            System.out.println("Nombre: " + p.getArticulos().get(i).getNombreArticulo());
            System.out.println("Costo por unidad: " + p.getArticulos().get(i).getCostoUnidad());
            System.out.println("Id: " + p.getArticulos().get(i).getId() + "\n");
            
            i++;
            }
        }
    }
}
