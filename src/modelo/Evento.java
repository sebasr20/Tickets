/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Sebastian
 */
public class Evento {
    private int idEvento;
    private String equipoLocal;
    private String descripcionEvento;
    private int jornadaEvento;
    private Date fechaEvento;
    private String horaEvento;
    private int visita;
    private boolean disponible;

    public Evento() {
    }

    public Evento(int idEvento, String equipoLocal, String descripcionEvento, int jornadaEvento, Date fechaEvento, String horaEvento, int visita, boolean disponible) {
        this.idEvento = idEvento;
        this.equipoLocal = equipoLocal;
        this.descripcionEvento = descripcionEvento;
        this.jornadaEvento = jornadaEvento;
        this.fechaEvento = fechaEvento;
        this.horaEvento = horaEvento;
        this.visita = visita;
        this.disponible = disponible;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getDescripcionEvento() {
        return descripcionEvento;
    }

    public void setDescripcionEvento(String descripcionEvento) {
        this.descripcionEvento = descripcionEvento;
    }

    public int getJornadaEvento() {
        return jornadaEvento;
    }

    public void setJornadaEvento(int jornadaEvento) {
        this.jornadaEvento = jornadaEvento;
    }

    public Date getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public String getHoraEvento() {
        return horaEvento;
    }

    public void setHoraEvento(String horaEvento) {
        this.horaEvento = horaEvento;
    }

    public int getVisita() {
        return visita;
    }

    public void setVisita(int visita) {
        this.visita = visita;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    

    

    

    
    
    
    
}
