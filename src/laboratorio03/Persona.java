/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio03;

public class Persona {
    private String Nombre, Apellido, DNI;

    public Persona(String nombre, String apellido, String dni) {
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.DNI = dni;
    }
    

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }
    
    
    public String getDni() {
        return DNI;
    }
    public void setDni(String dni) {
        this.DNI = dni;
    }
    
    
    public String consola() {
        return "[ " + this.Nombre + " " +
            this.Apellido + " ]"  + " / [ "+
            this.DNI + " ]";                        
    }
}
