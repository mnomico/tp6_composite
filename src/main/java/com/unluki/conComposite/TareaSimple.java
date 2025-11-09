package com.unluki.conComposite;

public class TareaSimple implements Tarea{

    private String nombre;
    private double duracion;
    private boolean completada;

    public TareaSimple(String nombre, double duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.completada = false;
    }

    @Override
    public String mostrarTarea() {
        return "Tarea Simple: " + nombre + " (duración: " + duracion + ")";
    }

    @Override
    public double calcularTiempoTotal() {
        return duracion;
    }

    @Override
    public void marcarCompleta() {
        this.completada = true;
    }

    @Override
    public double reporteProgreso() {
        return completada ? 100 : 0;
    }
}
