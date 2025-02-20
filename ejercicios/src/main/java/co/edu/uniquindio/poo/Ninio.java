package co.edu.uniquindio.poo;

public class Ninio {
    private String nombre;
    private int edad;
    private String genero;
    private int identificacion;
    private String alergias;
    private String nombreAcudiente;
    private String contactoAcudiente;

    public Ninio(String nombre, int edad, String genero, int identificacion, String alergias , String nombreAcudiente, String contactoAcudiente) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.identificacion = identificacion;
        this.nombreAcudiente = nombreAcudiente;
        this.contactoAcudiente = contactoAcudiente;

    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public int getIdentificacion() { return identificacion; }
    public void setIdentificacion(int identificacion) { this.identificacion = identificacion; }

    public String getAlergias() { return alergias; }
    public void setAlergias(String alergias) { this.alergias = alergias; }

    public String getNombreAcudiente() { return nombreAcudiente; }
    public void setNombreAcudiente(String nombreAcudiente) { this.nombreAcudiente = nombreAcudiente; }

    public String getContactoAcudiente() { return contactoAcudiente; }
    public void setContactoAcudiente(String contactoAcudiente) { this.contactoAcudiente = contactoAcudiente; }

    @Override
    public String toString() {
        return "Ninio{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                ", identificacion=" + identificacion +
                ", alergias='" + alergias + '\'' +
                ", nombreAcudiente='" + nombreAcudiente + '\'' +
                ", contactoAcudiente='" + contactoAcudiente + '\'' +
                '}';
    }

        public static void main(String[] args) {
            Ninio nino1 = new Ninio("Juan", 5, "Masculino", 123456, "Ninguna", "Maria Perez", "3123456789");
            System.out.println(nino1);
        }
    

}
