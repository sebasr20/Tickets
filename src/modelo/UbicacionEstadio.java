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
public class UbicacionEstadio {
    private int idUbicacion;
    private String nombreUbicacion;
    private int idEstadio;

    public UbicacionEstadio() {
    }

    public UbicacionEstadio(int idUbicacion, String nombreUbicacion, int idEstadio) {
        this.idUbicacion = idUbicacion;
        this.nombreUbicacion = nombreUbicacion;
        this.idEstadio = idEstadio;
    }

    public int getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getNombreUbicacion() {
        return nombreUbicacion;
    }

    public void setNombreUbicacion(String nombreUbicacion) {
        this.nombreUbicacion = nombreUbicacion;
    }

    public int getIdEstadio() {
        return idEstadio;
    }

    public void setIdEstadio(int idEstadio) {
        this.idEstadio = idEstadio;
    }
    
    
}
