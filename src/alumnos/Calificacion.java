package alumnos;

import javax.swing.JOptionPane;

public class Calificacion {
    float cAsistencia;
    float cParticipacion;
    float cTareas;
    float cExamen;
    Unidad unidad;
    
    /**
     * Constructor de la clase Calificacion
     * @param unidad objecto Unidad que contiene los datos para evaluacion de la unidad
     */
    public Calificacion(Unidad unidad){
        this.unidad = unidad;
    }
    /**
     * calcula el valor final de la calificacion
     * @return valor final de la calificacion
     */
    public float getCalificacion(){
       return cAsistencia + cParticipacion + cTareas + cExamen; 
    }
    /**
     * Solicita las asistencias reales del alumno, para luego compararlas con 
     * las maximas asistencias de la unidad y obtener su calificacion en este 
     * rubro
     */
    public void calificarAsistencia(){
        byte aluAsistencias = Byte.parseByte(JOptionPane.showInputDialog(unidad.getNombre() + " Asistencias del alumno: "));
        cAsistencia = aluAsistencias*10/unidad.getAsistencias();
    }
    /**
     * Solicita las participaciones reales del alumno, para luego compararlas con 
     * las maximas participaciones de la unidad y obtener su calificacion en este 
     * rubro
     */
    public void calificarParticipacion(){
        short aluParticipaciones = Short.parseShort(JOptionPane.showInputDialog(unidad.getNombre() + " Participaciones del alumno: "));
        cParticipacion = aluParticipaciones*10/unidad.getParticipaciones();
    }
    
    /**
     * Solicita las tareas reales del alumno, para luego compararlas con 
     * las maximas tareas de la unidad y obtener su calificacion en este 
     * rubro
     */
    public void calificarTareas(){
        Byte aluTareas = Byte.parseByte(JOptionPane.showInputDialog(unidad.getNombre() + " Tareas del alumno: "));
        cTareas = aluTareas*30/unidad.getTareas();
    }
    
    /**
     * Solicita llos aciertos del alumno en el examen, para luego compararlas con 
     * los maximos aciertos del examen de la unidad y obtener su calificacion en este 
     * rubro
     */
    public void calificarExamen(){
        Float aluExamen = Float.parseFloat(JOptionPane.showInputDialog(unidad.getNombre() + " Aciertos del alumno: "));
        cExamen = aluExamen*50/unidad.getAciertosExamen();
        
    }
    /**
     * Este metodo manda llamar los metodos que solicitan los puntajes del alumno en
     * <ul> 
     *  <li> {@link #calificarAsistencia()} Asistencias del alumno para la unidad </li>
     *  <li> {@link #calificarParticipacion()} Participaciones del alumno para la unidad </li>
     *  <li> {@link #calificarTareas()} Tareas del alumno para la unidad </li>
     *  <li> {@link #calificarExamen()} Aciertos del alumno en el examen de la unidad </li>
     * </ul>
     */
    public void calificar(){
        calificarAsistencia();
        calificarParticipacion();
        calificarTareas();
        calificarExamen();
    }
}
