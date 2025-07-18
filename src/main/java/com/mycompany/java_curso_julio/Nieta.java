/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_curso_julio;

/**
 *
 * @author aitor
 */
public class Nieta extends Hija{
    protected String musica;
    public Nieta(String nombre, int edad, double sueldo, String carrera, String musica) {
        super(nombre, edad, sueldo, carrera);
        this.musica= musica;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }
    
    
}
