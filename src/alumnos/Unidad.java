package alumnos;

public class Unidad {
    String nombre;
    float asistencias;
    float participaciones;
    float tareas;
    float aciertosExamen;

    public Unidad(){}
    
    public Unidad(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(float asistencias) {
        this.asistencias = asistencias;
    }

    public float getParticipaciones() {
        return participaciones;
    }

    public void setParticipaciones(float participaciones) {
        this.participaciones = participaciones;
    }

    public float getTareas() {
        return tareas;
    }

    public void setTareas(float tareas) {
        this.tareas = tareas;
    }

    public float getAciertosExamen() {
        return aciertosExamen;
    }

    public void setAciertosExamen(float aciertosExamen) {
        this.aciertosExamen = aciertosExamen;
    }
}
