package uniquindio.edu.co.poo;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class HelloController {

    @FXML
    private TextField txtNombre, txtSexo, txtCiudad;

    @FXML
    private TableView<Persona> tablaPersonas;

    @FXML
    private TableColumn<Persona, String> colNombre, colSexo, colCiudad;

    private final ObservableList<Persona> lista = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        colNombre.setCellValueFactory(cellData -> cellData.getValue().nombreProperty());
        colSexo.setCellValueFactory(cellData -> cellData.getValue().sexoProperty());
        colCiudad.setCellValueFactory(cellData -> cellData.getValue().ciudadProperty());

        tablaPersonas.setItems(lista);
    }

    @FXML
    private void guardarPersona() {
        Persona p = new Persona(
                txtNombre.getText(),
                txtSexo.getText(),
                txtCiudad.getText()
        );
        lista.add(p);
        txtNombre.clear();
        txtSexo.clear();
        txtCiudad.clear();
    }

    @FXML
    private void verDatos() {
        tablaPersonas.refresh();
    }
}

