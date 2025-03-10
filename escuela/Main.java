import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Escuela escuela = new Escuela("CASD", "123");

        //Creamos Docentes

        Docente docente1 = new Docente("Raul Rivera", "Ingeniero");
        Docente docente2 = new Docente("Maria Gomez", "Licenciada");

        //Creamos a los Estudiantes

        Estudiante estudiante1 = new Estudiante("Juan Rojas ", 16);
        Estudiante estudiante2 = new Estudiante("Juliana Gonzales", 17);
        Estudiante estudiante3 = new Estudiante("Camila Lopez", 15);
        Estudiante estudiante4 = new Estudiante("Pedro jaramillo", 16);
        Estudiante estudiante5 = new Estudiante("Oscar Perez", 16);

        //vamos agregar docentes a la escuela

        escuela.registrarDocente(docente1);
        escuela.registrarDocente(docente2);

        //vamos agregar estudiantes a la escuela

        escuela.registrarEstudiante(estudiante1);
        escuela.registrarEstudiante(estudiante2);
        escuela.registrarEstudiante(estudiante3);
        escuela.registrarEstudiante(estudiante4);
        escuela.registrarEstudiante(estudiante5);

        //asignar estudiantes a la materia
        List<Estudiante> estudianteCurso = new ArrayList<>();
        estudianteCurso.add(estudiante1);
        estudianteCurso.add(estudiante3);
        estudianteCurso.add(estudiante5);

        //creamos la materia
        Materia materia = new Materia("Programación 1", "003R", docente1, estudianteCurso);

        escuela.registrarMateria(materia);

        System.out.println(materia.toString());

    }
}
