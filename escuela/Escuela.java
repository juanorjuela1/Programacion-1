import java.util.List;
import java.util.ArrayList;

public class Escuela {
    private String nombre;
    private String id;
    private List<Docente> listDocente;
    private List<Materia> listMateria;
    private List<Nota> listNota;
    private List<Estudiante> listEstudiante;

    /**
     * Metodo contructor de la clase Escuela
     * @param nombre, id
     * @param
     */

    public Escuela(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.listDocente = new ArrayList<>();
        this.listMateria = new ArrayList<>();
        this.listNota = new ArrayList<>();
        this.listEstudiante = new ArrayList<>();
    }

    /**
     * Metodo para registrar Docentes a la Escuela
     * @param docente
     */

    public void registrarDocente(Docente docente) {
        listDocente.add(docente);
    }

    /**
     * Metodo para registrar Materias en la Escuela
     * @param materia
     */

    public void registrarMateria(Materia materia) {
        listMateria.add(materia);
    }

    /**
     * Metodo para registrar Notas en la Escuela
     * @param nota
     */

    public void registrarNota(Nota nota) {
        listNota.add(nota);
    }

    /**
     * Metodo para registrar Estudiantes en la Escuela
     * @param estudiante
     */

    public void registrarEstudiante(Estudiante estudiante) {
        listEstudiante.add(estudiante);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Docente> getListDocente() {
        return listDocente;
    }

    public void setListDocente(List<Docente> listDocente) {
        this.listDocente = listDocente;
    }

    public List<Materia> getListMateria() {
        return listMateria;
    }

    public void setListMateria(List<Materia> listMateria) {
        this.listMateria = listMateria;
    }

    public List<Nota> getListNota() {
        return listNota;
    }

    public void setListNota(List<Nota> listNota) {
        this.listNota = listNota;
    }

    public List<Estudiante> getListEstudiante() {
        return listEstudiante;
    }

    public void setListEstudiante(List<Estudiante> listEstudiante) {
        this.listEstudiante = listEstudiante;
    }

    @Override
    public String toString() {
        return "Escuela{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", listDocente=" + listDocente +
                ", listMateria=" + listMateria +
                ", listNota=" + listNota +
                ", listEstudiante=" + listEstudiante +
                '}';
    }
}
