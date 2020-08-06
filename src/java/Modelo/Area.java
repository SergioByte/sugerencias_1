/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author TuNombre
 */
public class Area {
    private int idarea;
    private String nombre;
    private String lugar;
    private int piso;
    private int cantidad_trabajadores;
    private String persona_a_cargo;
    
    public Area (){
    }

    public Area(int idarea, String nombre, String lugar, int piso, int cantidad_trabajadores, String persona_a_cargo) {
        this.idarea = idarea;
        this.nombre = nombre;
        this.lugar = lugar;
        this.piso = piso;
        this.cantidad_trabajadores = cantidad_trabajadores;
        this.persona_a_cargo = persona_a_cargo;
    }

    public int getIdarea() {
        return idarea;
    }

    public void setIdarea(int idarea) {
        this.idarea = idarea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public int getCantidad_trabajadores() {
        return cantidad_trabajadores;
    }

    public void setCantidad_trabajadores(int cantidad_trabajadores) {
        this.cantidad_trabajadores = cantidad_trabajadores;
    }

    public String getPersona_a_cargo() {
        return persona_a_cargo;
    }

    public void setPersona_a_cargo(String persona_a_cargo) {
        this.persona_a_cargo = persona_a_cargo;
    }
    
}
