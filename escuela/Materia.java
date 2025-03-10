import java.util.List;

public class Materia {

    private String nombre;
    private String id;
    private Docente docente;
    private List<Estudiante> listEstudiante;

    /**
     * Metodo contructor de la clase Materia
     * @param nombre, id
     * @param
     */

    public Materia(String nombre, String id,Docente docente, List<Estudiante> listEstudiante ) {
        this.nombre = nombre;
        this.id = id;
        this.docente = docente;
        this.listEstudiante = listEstudiante;
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

    public Docente getDocente() {
        return docente;
    }
    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public List<Estudiante> getListEstudiante() {
        return listEstudiante;
    }

    public void setListEstudiante(List<Estudiante> listEstudiante) {
        this.listEstudiante = listEstudiante;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", docente=" + docente +
                ", listEstudiante=" + listEstudiante +
                '}';
    }
}
