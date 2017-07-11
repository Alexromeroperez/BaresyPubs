package com.arp.baresypubs.pojo;

/**
 * Created by Alex on 10/07/2017.
 */

public class Bar {

    private String nombre,direccion,comentario;
    private double altitud,longitud;

    public Bar() {
    }

    public Bar(String nombre, String direccion, String comentario, double altitud, double longitud) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.comentario = comentario;
        this.altitud = altitud;
        this.longitud = longitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Bar{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", comentario='" + comentario + '\'' +
                ", altitud=" + altitud +
                ", longitud=" + longitud +
                '}';
    }
}
