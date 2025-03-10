public class Docente {

    private String nombre;
    private String titulo;

    /**
     * Metodo contructor de la clase Docente
     * @param nombre, titulo
     * @param
     */

    public Docente(String nombre, String titulo) {
        this.nombre = nombre;
        this.titulo = titulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "nombre='" + nombre + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
