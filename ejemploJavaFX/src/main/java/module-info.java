module lucena.rafa.ejemploJavaFX.ejemploJavaFX {
    requires javafx.controls;
    requires javafx.fxml;

    opens lucena.rafa.ejemploJavaFX.ejemploJavaFX to javafx.fxml;
    exports lucena.rafa.ejemploJavaFX.ejemploJavaFX;
}
