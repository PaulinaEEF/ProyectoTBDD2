/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jedisprueba;

/**
 *
 * @author euced
 */
public class Preguntas {
    private int id;
    private String titulo;
    private String descripcion;
    private int idClase;
    private boolean respuesta;

    public Preguntas(int id, String titulo, String descripcion, int idClase, boolean respuesta) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.idClase = idClase;
        this.respuesta = respuesta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public boolean isRespuesta() {
        return respuesta;
    }

    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "Preguntas{" + "id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", idClase=" + idClase + ", respuesta=" + respuesta + '}';
    }
    
    
}
