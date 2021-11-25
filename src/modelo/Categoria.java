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
public class Categoria {
    private int idcategoria;
    private String nombreCategoria;

    public Categoria() {
    }

    public Categoria(int idcategoria, String nombreCategoria) {
        this.idcategoria = idcategoria;
        this.nombreCategoria = nombreCategoria;
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }
    
    
}
