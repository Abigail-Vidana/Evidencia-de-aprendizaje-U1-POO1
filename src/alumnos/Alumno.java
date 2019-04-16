package alumnos;

public class Alumno {
    private String Nombre;
    private String Apellido;
    private int Matricula;
    private final Calificacion[] calificaciones;
    
    /**
     * Construcctor de la clase Alumno
     * @param unidades arreglo de las unidades que se estan calificando
     */
    public Alumno(Unidad[] unidades){
        this.calificaciones = new Calificacion[unidades.length];
        for(int i = 0; i < unidades.length; i++){
            calificaciones[i] = new Calificacion(unidades[i]);
        }
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }
    
    public void calificar(){
        for(int i = 0; i < calificaciones.length; i++){
            calificaciones[i].calificar();
        }
    }
    
    public float getPromedio(){
        float sumatoria = 0f;
        for(int i = 0; i < calificaciones.length; i++){
            sumatoria += calificaciones[i].getCalificacion();
        }
        return sumatoria/calificaciones.length;
    }
    
    public String print(){
        String nl = System.getProperty("line.separator");
        return String.format("Nombre: %s%s Apellido: %s%s Matricula: %d%s%s Promedio: %1.2f%s"
            ,Nombre,nl,Apellido,nl,Matricula,nl,nl,getPromedio(),nl);
    }
    
}
