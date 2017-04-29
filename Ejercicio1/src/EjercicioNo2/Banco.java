/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioNo2;
import java.util.ArrayList;

/**
 *
 * @author BRIAN
 */
public class Banco {
    private String codigo;
    private ArrayList <Tipo> tipos = new ArrayList<>();
    private ArrayList <Cuenta> cuentas = new ArrayList<>();

    public Banco(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public void añadirTipo(Tipo t){
        this.tipos.add(t);
    }
    
    public void removertipo(Tipo t){
        this.tipos.remove(t);
    }

    public void añadirCuenta(Cuenta c){
        this.cuentas.add(c);
    }
    
    public void removerCuenta (Cuenta c){
        this.cuentas.remove(c);
    }
   
    public Cuenta getCuenta(int index){
        return (Cuenta) cuentas.get(index);
    }
    
    public int getCuentaCuenta(){
        return cuentas.size();
    }

    public ArrayList getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList cuentas) {
        this.cuentas = cuentas;
    }

    public ArrayList<Tipo> getTipos() {
        return tipos;
    }

    public void setTipos(ArrayList<Tipo> tipos) {
        this.tipos = tipos;
    }
    
    public void listar(){
        int i=0;
        for(Cuenta c : this.cuentas){
            i++;
            System.out.println("Nombre del cliente: " + c.getNombreCliente());
            System.out.println("Balance actual;" + c.getBalanceActual());
            System.out.println("Movimientos" + c.getMovimientos());
            System.out.println("Numero de cuenta" + c.getNumeroCuenta());
        }
        
        
    }
    
    /*public void listar(){
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
    
    */

    @Override
    public String toString() {
        return "Banco{" + "codigo=" + codigo + ", tipos=" + tipos + ", cuentas=" + cuentas + '}';
    }

    
    
    
}
