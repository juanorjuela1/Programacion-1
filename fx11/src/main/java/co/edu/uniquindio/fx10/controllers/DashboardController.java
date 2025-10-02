package co.edu.uniquindio.fx10.controllers;

import co.edu.uniquindio.fx10.App;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

import java.io.IOException;

/**
 * Controlador para el Dashboard principal
 */
public class DashboardController {

    @FXML
    private VBox contenedorPrincipal;

    @FXML
    private Label lblTitulo;

    @FXML
    private Button btnVerProductos;

    @FXML
    private Button btnCrearProducto;

    @FXML
    public void initialize() {
        // Inicialización si es necesaria
    }

    /**
     * Maneja el evento de click en el botón "Crear Producto"
     */
    @FXML
    private void onCrearProducto() {
        try {
            FXMLLoader loader = new FXMLLoader(App.class.getResource("/co/edu/uniquindio/fx10/vista/FormularioProducto.fxml"));
            Parent formulario = loader.load();

            // Obtener el controlador del formulario
            FormularioProductoController controller = loader.getController();
            controller.setDashboardController(this);

            // Reemplazar el contenido del contenedor principal
            contenedorPrincipal.getChildren().clear();
            contenedorPrincipal.getChildren().add(formulario);

        } catch (IOException e) {
            mostrarAlerta("Error", "No se pudo cargar el formulario", Alert.AlertType.ERROR);
            e.printStackTrace();
        }
    }

    /**
     * Maneja el evento de click en el botón "Ver Productos"
     */
    @FXML
    private void onVerProductos() {
        try {
            FXMLLoader loader = new FXMLLoader(App.class.getResource("/co/edu/uniquindio/fx10/vista/ListadoProducto.fxml"));
            Parent listado = loader.load();

            // Obtener el controlador del listado
            ListadoProductoController controller = loader.getController();
            controller.setDashboardController(this);

            // Reemplazar el contenido del contenedor principal
            contenedorPrincipal.getChildren().clear();
            contenedorPrincipal.getChildren().add(listado);

        } catch (IOException e) {
            mostrarAlerta("Error", "No se pudo cargar el listado de productos", Alert.AlertType.ERROR);
            e.printStackTrace();
        }
    }

    /**
     * Restaura la vista del dashboard
     */
    public void restaurarVista() {
        try {
            FXMLLoader loader = new FXMLLoader(App.class.getResource("/co/edu/uniquindio/fx10/vista/Dashboard.fxml"));
            Parent dashboard = loader.load();

            contenedorPrincipal.getChildren().clear();
            contenedorPrincipal.getChildren().add(dashboard);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Muestra una alerta al usuario
     */
    private void mostrarAlerta(String titulo, String mensaje, Alert.AlertType tipo) {
        Alert alerta = new Alert(tipo);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }

    public VBox getContenedorPrincipal() {
        return contenedorPrincipal;
    }


}
