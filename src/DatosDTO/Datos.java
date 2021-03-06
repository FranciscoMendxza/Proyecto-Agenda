/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatosDTO;
/**
 *
 * @author panch
 */
public class Datos {
    
    String nombre;
    int telefono;
    String direccion;
    int celular;
    int id;

    public Datos() {
    }

    public Datos(String nombre, int telefono, String direccion, int celular, int id) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.celular = celular;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public String [] getArray(){
        String[] datos = {nombre, String.valueOf(telefono), direccion, String.valueOf(celular), String.valueOf(id)};
         return datos;
    }
    
}
    
    

