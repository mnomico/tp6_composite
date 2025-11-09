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
        this.estado = estado;
    }

    public String toString(){
        return "id: "+this.id+" duracion: "+this.duracion+" descripcion: "+this.descripcion+" ESTADO: "+this.estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(id, persona.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    
}
