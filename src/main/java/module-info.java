module com.example.gamenamegenerator {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.gamenamegenerator to javafx.fxml;
    exports com.example.gamenamegenerator;
}