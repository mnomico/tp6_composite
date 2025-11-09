package com.unluki.sincomposite;

import java.util.HashMap;

public class Story {
    private int id;
    private String titulo;
    private HashMap<Integer,Tarea> tareas;

    public Story(int id, String titulo){
        this.tareas = new HashMap<>();
        this.titulo = titulo;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void addTarea(Tarea tarea){
        this.tareas.put(tarea.getId(), tarea);
    }
    
    public Tarea getTarea(int id){
        return this.tareas.get(id);
    }

    public int getCantidadTareas(){
        return this.tareas.size();
    }

    public double getPorcentajeCompletado() {
        if (tareas.isEmpty()) return 0;

        int suma = 0;

        for (Tarea tarea : tareas.values()) {
            suma += tarea.getProgreso();
        }

        double promedio = suma / getCantidadTareas();

        return Math.round(promedio);
    }

    public void removeTarea(int id){
        this.tareas.remove(id);
    }

    public int getDuracionTotal(){
        int result = 0;
        for (Tarea tarea : tareas.values()) {
            result = result + tarea.getDuracion();
        }

        return result;
    }

    public String toString(){
        String result = "\tStory: "+this.id+ " "+this.titulo + " total completado: %"+this.getPorcentajeCompletado() + "\n";

        for (Tarea tarea : tareas.values()) {
            result += "\t\t" + tarea.toString() + "\n";
        }

        return result;
    }
}
