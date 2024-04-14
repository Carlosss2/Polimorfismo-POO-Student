package carlos.c.descartes.controllers;


import java.net.URL;
import java.util.ResourceBundle;

import carlos.c.descartes.App;
import carlos.c.descartes.models.Registro;
import carlos.c.descartes.models.Student;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class SaveController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField apellidoStudent;

    @FXML
    private TextField matriculaStudent;

    @FXML
    private TextField nombreStudent;


    @FXML
    void onMouseClickSalirButton(MouseEvent event) {
        Stage stage = (Stage) nombreStudent.getScene().getWindow();
        stage.close();
    }

    @FXML
    void onMouseClickSaveButton(MouseEvent event) {
        String name = nombreStudent.getText();
        String firstName = apellidoStudent.getText();
        String matricula = matriculaStudent.getText();
        Student student=new Student(name,firstName,matricula );
        App.getRegistro().addAlumno(student);
        App.getRegistro().addBaseDatos();


    }

    @FXML
    void initialize() {

    }

}

