package carlos.c.descartes.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import carlos.c.descartes.App;
import carlos.c.descartes.models.Registro;
import carlos.c.descartes.models.Student;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class UpdateController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Student, String> apellido;

    @FXML
    private TextField apellidoStudent;

    @FXML
    private TableColumn<Student, String> matricula;

    @FXML
    private TextField matriculaStudent;

    @FXML
    private TableColumn<Student, String> nombre;

    @FXML
    private TextField nombreStudent;

    @FXML
    private TableView<Student> tableView;

    @FXML
    void onMouseClickSalirButton(MouseEvent event) {
        Stage stage = (Stage) nombreStudent.getScene().getWindow();
        stage.close();

    }

    @FXML
    void onMouseClickRevisarButton(MouseEvent event) {
        Registro registro = App.getRegistro();
        if (!registro.getEstudiantes().isEmpty()) {
            tableView.getItems().clear();
            tableView.getItems().addAll(registro.getEstudiantes());

        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("La lista se encuentra vacia.");
            alert.showAndWait();

        }

    }

    @FXML
    void onMouseClickUpdateButton(MouseEvent event) {
        Registro registro = App.getRegistro();
        String name = nombreStudent.getText();
        String apellido = apellidoStudent.getText();
        String matricula = matriculaStudent.getText();

        if (name.isEmpty() || apellido.isEmpty() || matricula.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("Rellene los campos correctamente.");
            alert.showAndWait();
        } else {
            if (!registro.getEstudiantes().isEmpty()) {
                boolean estudianteEncontrado = false;
                for (Student student : registro.getEstudiantes()) {
                    if (name.equals(student.getName())) {
                        student.setFirstName(apellido);
                        student.setMatricula(matricula);
                        estudianteEncontrado = true;
                        nombreStudent.clear();
                        apellidoStudent.clear();
                        matriculaStudent.clear();
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setHeaderText(null);
                        alert.setContentText("¡Los datos sean actualizado correctamente!.");
                        alert.showAndWait();
                    } else {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setHeaderText(null);
                        alert.setContentText("No exite el estudiante , no se puede actualizar.");
                        alert.showAndWait();

                    }

                }
                if (estudianteEncontrado) {
                    tableView.getItems().clear();
                    tableView.getItems().addAll(registro.getEstudiantes());
                }
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setContentText("No se ha podido actualizar, la lista se encuentra vacia.");
                alert.showAndWait();
            }
        }

    }



    @FXML
    void initialize() {
        nombre.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        apellido.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        matricula.setCellValueFactory(cellData -> cellData.getValue().matriculaProperty());

    }

}
