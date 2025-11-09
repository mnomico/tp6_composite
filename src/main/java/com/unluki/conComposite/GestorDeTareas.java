package com.unluki.conComposite;

import java.util.ArrayList;
import java.util.List;

public class GestorDeTareas {

    private final List<Tarea> listaTareas;

    public GestorDeTareas() {
        this.listaTareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        listaTareas.add(tarea);
    }

    public void mostrarTablero() {
        for (Tarea tarea : listaTareas) {
            System.out.println("==============================================================================");
            System.out.println(tarea.mostrarTarea());
            System.out.println("==============================================================================");
        }
    }

}
