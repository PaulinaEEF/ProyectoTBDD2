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
public class Clase {
    private int id;
    private String nombreClase;

    public Clase(int id, String nombreClase) {
        this.id = id;
        this.nombreClase = nombreClase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    @Override
    public String toString() {
        return "Clase{" + "id=" + id + ", nombreClase=" + nombreClase + '}';
    }
    
    
}
