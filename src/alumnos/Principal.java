package alumnos;

import javax.swing.JOptionPane;

/*La escuela Secundaria “Sor Juana Inés de la Cruz”, requiere de un software 
para facilitar a sus docentes a obtener las calificaciones finales de sus alumnos. 
Se debe considerar que cada grupo (A - F) no sobrepasa los 30 alumnos. 
Cada docente debe promediar su materia en particular con base al 100% de 
calificación, tomando en cuenta para cada una de las tres unidades: la asistencia 
(10%), participación (10%), tareas presentadas (30%) y el exámen (50%). 
Se requiere que el programa visualice los datos generales del alumno 
(Nombre, apellido, matrícula, grado, grupo, nombre de la escuela, nombre del 
docente y materia que cursa) y obtener el promedio de la materia; además, 
presentar el total de alumnos que han aprobado y reprobado el curso.
*/

public class Principal {
    static final String institucion = "Secundaria Sor Juana Inés de la Cruz";
    static final String nl = System.getProperty("line.separator");
    
    public static void main(String[] args) {
        byte aprobados = 0;
        byte reprobados = 0;
        byte totalAlumnos;
        Materia materia = new Materia(3);
        
        //Pedir los datos que por default son los mismos para cada alumno
        materia.setDocente(JOptionPane.showInputDialog("Docente: "));
        materia.setNombre(JOptionPane.showInputDialog("Materia: "));
        materia.setGrupo(JOptionPane.showInputDialog("Grupo: ").charAt(0));
        materia.setGrado(Byte.parseByte(JOptionPane.showInputDialog("Grado: ")));
        materia.iniciarUnidades();
        totalAlumnos = Byte.parseByte(JOptionPane.showInputDialog("Cuantos alumnos son? "));
//        Alumno[] alumnos = new Alumno[totalAlumnos];
        for( int i = 0; i < totalAlumnos; i ++){
            Alumno alumno = new Alumno(materia.getUnidades());
            pedirDatos(alumno);
            if(alumno.getPromedio() < 60)
                reprobados++;
            else
                aprobados++;
            mostrarDatos(alumno,materia);
        }
        JOptionPane.showMessageDialog(null,String.format("Total de alumnos: %d%s%sAlumnos Aprobados: %d%sAlumnos Reprobados: %d%s",
                totalAlumnos,nl,nl,aprobados,nl, reprobados,nl));
    }
   
    public static void pedirDatos(Alumno alumno){
        
       alumno.setNombre(JOptionPane.showInputDialog("Nombre(s): "));
       alumno.setApellido(JOptionPane.showInputDialog("Apellido(s): "));
       alumno.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Matricula: ")));
       alumno.calificar();
   }
    
    public static void mostrarDatos(Alumno alumno, Materia materia){
         JOptionPane.showMessageDialog(null,String.format("Escuela: %s %s %s %s",institucion,nl, materia.print(), alumno.print()));
    }
    
}
