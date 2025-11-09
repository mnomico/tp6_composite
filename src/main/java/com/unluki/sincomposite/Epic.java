package com.unluki.sincomposite;

import java.util.HashMap;

public class Epic {
    private int id;
    private String titulo;
    private HashMap<Integer, Story> stories;

    public Epic(int id, String titulo){
        this.stories = new HashMap<>();
        this.id = id;
        this.titulo = titulo;
    }

    public int getCantidadStories(){
        return this.stories.size();
    }

    public void addStory(Story story){
        this.stories.put(story.getId(), story);
    }

    public Story getStory(int id){
        return this.stories.get(id);
    }

    public void addTask(int storyId, Tarea tarea){
        this.getStory(storyId).addTarea(tarea); // esto si lo hacemos y añadimos más niveles de árbol (ej subtarea, big EPIC u otro), crece de forma indefinida
    }

    public Tarea getTask(int storyId, int taskId){
        return this.getStory(storyId).getTarea(taskId); // también debemos pasar múltiples parámetros para obtener un solo dato
    }

    public double getPorcentajeCompletado() {
        // acá podemos ver que también hace que se genere código casi idéntico al de Story
        if (stories.isEmpty()) return 0;

        int suma = 0;

        for (Story story : stories.values()) {
            suma += story.getPorcentajeCompletado();
        }

        double promedio = suma / getCantidadStories();

        return Math.round(promedio);
    }

    public int getDuracionTotal(){
        //lo mismo que el método anterior
        int result = 0;
        for (Story story : stories.values()) {
            result = result + story.getDuracionTotal();
        }

        return result;
    }


    public String toString(){
        String result = "Epic: "+this.id+ " "+this.titulo + " total completado: %"+this.getPorcentajeCompletado() + "\n";
        for (Story story : stories.values()) {
            result += "   "+story.toString()+"\n";
        }

        return result;
    }

}
