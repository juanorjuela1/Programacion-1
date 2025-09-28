package uniquindio.edu.co.poo;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Persona {
    private final StringProperty nombre;
    private final StringProperty sexo;
    private final StringProperty ciudad;

    public Persona(String nombre, String sexo, String ciudad) {
        this.nombre = new SimpleStringProperty(nombre);
        this.sexo = new SimpleStringProperty(sexo);
        this.ciudad = new SimpleStringProperty(ciudad);
    }

    public StringProperty nombreProperty() { return nombre; }
    public StringProperty sexoProperty() { return sexo; }
    public StringProperty ciudadProperty() { return ciudad; }
}

