package com.unluki.conComposite;

import java.util.ArrayList;
import java.util.List;

public class TareaCompuesta implements Tarea{

    private final String nombre;
    private final List<Tarea> listaTareas;

    public TareaCompuesta(String nombre) {
        this.nombre = nombre;
        listaTareas = new ArrayList<>();
    }

    @Override
    public String mostrarTarea() {
        StringBuilder salida = new StringBuilder("Tarea Compuesta: " + nombre + " (duración: " + calcularTiempoTotal() + ")");
        for (Tarea tarea : listaTareas) {
            salida.append("\n").append(tarea.mostrarTarea());
        }
        return salida.toString();
    }

    @Override
    public double calcularTiempoTotal() {
        double tiempoTotal = 0;
        for (Tarea tarea : listaTareas) {
            tiempoTotal += tarea.calcularTiempoTotal();
        }
        return tiempoTotal;
    }

    @Override
    public void marcarCompleta() {
        for (Tarea tarea : listaTareas) {
            tarea.marcarCompleta();
        }
    }

    @Override
    public double reporteProgreso() {
        double sumatoriaPorcentajes = 0;
        int cantidadTareasSimples = 0;
        for (Tarea tarea : listaTareas) {
            if (tarea instanceof TareaSimple) {
                cantidadTareasSimples++;
            }
            sumatoriaPorcentajes = tarea.reporteProgreso();
        }
        return cantidadTareasSimples > 0 ? (sumatoriaPorcentajes / cantidadTareasSimples) : 0;
    }

    public void agregarSubtarea(Tarea tarea) {
        listaTareas.add(tarea);
    }

    public void quitarSubtarea(Tarea tarea) {
        listaTareas.remove(tarea);
    }

    public Tarea obtenerSubtarea(int numeroTarea) {
        return listaTareas.get(numeroTarea);
    }
}
