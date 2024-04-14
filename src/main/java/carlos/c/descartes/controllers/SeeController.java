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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class SeeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Student, String> apellidoMySQL;

    @FXML
    private TableColumn<Student, String> apellidoSQL;

    @FXML
    private TableColumn<Student, String> apellidoSQLite;

    @FXML
    private TableColumn<Student, String> matriculaMySQL;

    @FXML
    private TableColumn<Student, String> matriculaSQL;

    @FXML
    private TableColumn<Student, String> matriculaSQLite;

    @FXML
    private TableColumn<Student, String> nombreMySQL;

    @FXML
    private TableColumn<Student, String> nombreSQL;

    @FXML
    private TableColumn<Student, String> nombreSQLite;

    @FXML
    private TableView<Student> tableViewMySQL;

    @FXML
    private TableView<Student> tableViewSQL;

    @FXML
    private TableView<Student> tableViewSQLite;

    @FXML
    void onMouseClickSalirButton(MouseEvent event) {
        Stage stage = (Stage) tableViewSQLite.getScene().getWindow();
        stage.close();

    }


    @FXML
    void onMouseClickSeeButton(MouseEvent event) {
        Registro registro = App.getRegistro();
        if (!registro.getEstudiantes().isEmpty()) {
            tableViewMySQL.getItems().clear();
            tableViewMySQL.getItems().addAll(registro.getEstudiantes());
            tableViewSQL.getItems().clear();
            tableViewSQL.getItems().addAll(registro.getEstudiantes());
            tableViewSQLite.getItems().clear();
            tableViewSQLite.getItems().addAll(registro.getEstudiantes());
        }
        else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText("La lista se encuentra vacia.");
            alert.showAndWait();

        }

    }

    @FXML
    void initialize() {
       nombreMySQL.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
       apellidoMySQL.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
       matriculaMySQL.setCellValueFactory(cellData -> cellData.getValue().matriculaProperty());

       nombreSQL.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
       apellidoSQL.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
       matriculaSQL.setCellValueFactory(cellData -> cellData.getValue().matriculaProperty());

       nombreSQLite.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
       apellidoSQLite.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
       matriculaSQLite.setCellValueFactory(cellData -> cellData.getValue().matriculaProperty());


    }

}
