package alumnos;

import javax.swing.JOptionPane;

public class Materia {
    String nombre;
    String docente;
    byte grado;
    char grupo;
    private final Unidad[] unidades;
    
    /**
     * Constructor de la clase Materia
     * @param total total de unidades para la materia
     */
    public Materia(int total){
        //inicializas el arreglo
        unidades = new Unidad[total];
        //creas elementos para cada indice del arreglo
        for(int i = 0; i < total; i++){
            unidades[i] = new Unidad("Unidad " + (i+1) );
        }
    }
    
    public Unidad[] getUnidades() {
        return unidades;
    }
    
    //Pedir los datos totales (máximos) 
    public void iniciarUnidades(){
        for( int i = 0; i < unidades.length; i++){
            unidades[i].setAsistencias(Float.parseFloat(JOptionPane.showInputDialog(unidades[i].getNombre() + " Asistencias totales: ")));
            unidades[i].setParticipaciones(Float.parseFloat(JOptionPane.showInputDialog(unidades[i].getNombre() + " Participaciones totales: ")));
            unidades[i].setTareas(Float.parseFloat(JOptionPane.showInputDialog(unidades[i].getNombre() + " Tareas totales: ")));
            unidades[i].setAciertosExamen(Float.parseFloat(JOptionPane.showInputDialog(unidades[i].getNombre() + " Aciertos totales del exámen: ")));
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public byte getGrado() {
        return grado;
    }

    public void setGrado(byte grado) {
        this.grado = grado;
    }

    public char getGrupo() {
        return grupo;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }
    
    public String print(){
        String nl = System.getProperty("line.separator");
        return String.format("Docente: %s%s Materia: %s%s Grado: %d%s Grupo: %c%s",
                docente,nl,nombre,nl,grado,nl, grupo,nl);
    }
}
