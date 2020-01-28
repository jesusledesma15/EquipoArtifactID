/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.equipo;

/**
 *
 * @author Jesus
 */
public class Equipo {
    private String nombre;
    private String division;
    private int numJugadores;
    private boolean isDescenso;

    public Equipo(String nombre, String division, int numJugadores, boolean isDescenso) {
        this.nombre = nombre;
        this.division = division;
        this.numJugadores = numJugadores;
        this.isDescenso = isDescenso;
    }
    public void cambiarNombreEquipo(String nuevo){
        this.nombre = nuevo;
    }
    public void ascender(){
        this.isDescenso = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDivision() {
        return division;
    }

    public void setDivisión(String division) {
        this.division = division;
    }

    public int getNumJugadores() {
        return numJugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

    public boolean isIsDescenso() {
        return isDescenso;
    }

    public void setIsDescenso(boolean isDescenso) {
        this.isDescenso = isDescenso;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", division=" + division + ", numJugadores=" + numJugadores + ", isDescenso=" + isDescenso + '}';
    }
           
}
