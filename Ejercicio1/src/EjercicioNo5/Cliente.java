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
public class Cliente extends DomainObject{
    
    private String nombre;
    private String apellido;
    private String telefono;
    private String calleDireccion;
    private String carreraDireccion;
    private String ciudad;
    private String estado;
    private String codigoPostal;
    private String pais;

    public Cliente(String nombre, String apellido, String telefono, String calleDireccion, String carreraDireccion, String ciudad, String estado, String codigoPostal, String pais, String _id) {
        super(_id);
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.calleDireccion = calleDireccion;
        this.carreraDireccion = carreraDireccion;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCalleDireccion() {
        return calleDireccion;
    }

    public void setCalleDireccion(String calleDireccion) {
        this.calleDireccion = calleDireccion;
    }

    public String getCarreraDireccion() {
        return carreraDireccion;
    }

    public void setCarreraDireccion(String carreraDireccion) {
        this.carreraDireccion = carreraDireccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
  
}
