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
public class Sugerencias {
    private int idsugerencia;
    private String mensaje;
    private String remitente;
    private String tipo;
    private String f_entrega;
    private String hora_entrega;
    private int idarea;
    
    public Sugerencias(){
        
    }

    public Sugerencias(int idsugerencia, String mensaje, String remitente, String tipo, String f_entrega, String hora_entrega, int idarea) {
        this.idsugerencia = idsugerencia;
        this.mensaje = mensaje;
        this.remitente = remitente;
        this.tipo = tipo;
        this.f_entrega = f_entrega;
        this.hora_entrega = hora_entrega;
        this.idarea = idarea;
    }

    public int getIdsugerencia() {
        return idsugerencia;
    }

    public void setIdsugerencia(int idsugerencia) {
        this.idsugerencia = idsugerencia;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getF_entrega() {
        return f_entrega;
    }

    public void setF_entrega(String f_entrega) {
        this.f_entrega = f_entrega;
    }

    public String getHora_entrega() {
        return hora_entrega;
    }

    public void setHora_entrega(String hora_entrega) {
        this.hora_entrega = hora_entrega;
    }

    public int getIdarea() {
        return idarea;
    }

    public void setIdarea(int idarea) {
        this.idarea = idarea;
    }
    
    
}
