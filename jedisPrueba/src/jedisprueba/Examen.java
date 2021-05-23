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
public class Examen {
    private int id;
    private int idClase;
    private int cantidad;
    private int nota;

    public Examen(int id, int idClase, int cantidad) {
        this.id = id;
        this.idClase = idClase;
        this.cantidad = cantidad;
    }

    public Examen(int id, int nota) {
        this.id = id;
        this.nota = nota;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Examen{" + "id=" + id + ", idClase=" + idClase + ", cantidad=" + cantidad + ", nota=" + nota + '}';
    }
    
    
}
