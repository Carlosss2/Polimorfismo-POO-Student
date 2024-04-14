module carlos.c.descartes {
    requires javafx.controls;
    requires javafx.fxml;


    opens carlos.c.descartes to javafx.fxml;
    exports carlos.c.descartes;
    exports carlos.c.descartes.controllers;
    opens carlos.c.descartes.controllers to javafx.fxml;
}