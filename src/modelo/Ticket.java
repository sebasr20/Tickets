/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.security.Timestamp;

/**
 *
 * @author Sebastian
 */
public class Ticket {
    private int idTicket, precioTicket;
    private String rutCliente;
    private Timestamp fechaCompra;
    private int idEstadio;
    private int idUbicacion;
    private int idEvento;

    public Ticket() {
    }

    public Ticket(int idTicket, int precioTicket, String rutCliente, Timestamp fechaCompra, int idEstadio, int idUbicacion, int idEvento) {
        this.idTicket = idTicket;
        this.precioTicket = precioTicket;
        this.rutCliente = rutCliente;
        this.fechaCompra = fechaCompra;
        this.idEstadio = idEstadio;
        this.idUbicacion = idUbicacion;
        this.idEvento = idEvento;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public int getPrecioTicket() {
        return precioTicket;
    }

    public void setPrecioTicket(int precioTicket) {
        this.precioTicket = precioTicket;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public Timestamp getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Timestamp fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getIdEstadio() {
        return idEstadio;
    }

    public void setIdEstadio(int idEstadio) {
        this.idEstadio = idEstadio;
    }

    public int getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    

    
    
    
}

    
