/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Sebastian
 */
public class Estadio {
    private int idEstadio;
    private String nombreEstadio;

    public Estadio() {
    }

    public Estadio(int idEstadio, String nombreEstadio) {
        this.idEstadio = idEstadio;
        this.nombreEstadio = nombreEstadio;
    }

    public int getIdEstadio() {
        return idEstadio;
    }

    public void setIdEstadio(int idEstadio) {
        this.idEstadio = idEstadio;
    }

    public String getNombreEstadio() {
        return nombreEstadio;
    }

    public void setNombreEstadio(String nombreEstadio) {
        this.nombreEstadio = nombreEstadio;
    }
    
    
}
