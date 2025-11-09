package com.unluki.sincomposite;

public class Tarea {
    private int id;
    private int duracion;
    private String descripcion;
    private Estado estado = Estado.POR_ASIGNAR;

    public Tarea(int id, int duracion, String descripcion){
        this.id = id;
        this.duracion = duracion;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public int getDuracion(){
        return this.duracion;
    }

    public int getProgreso(){
        return this.estado.getCodigo();
    }

    public Estado getEstado(){
        return this.estado;
    }

    public Estado setEstado(Estado estado){
        return this.estado = estado;
    }

    public String toString(){
        return "Tarea: "+this.id+" duracion: "+this.duracion+" descripcion: "+this.descripcion+" ESTADO: "+this.estado;
    }

}
