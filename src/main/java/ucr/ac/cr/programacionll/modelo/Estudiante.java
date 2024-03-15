/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.programacionll.modelo;

/**
 *
 * @author Usuario
 */
public class Estudiante {
    
    private String carnet;
    private String nombre;
    
    public Estudiante(String carnet, String nombre) {
        this.carnet = carnet;
        this.nombre = nombre;
    }

    public Estudiante() {
        
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}

