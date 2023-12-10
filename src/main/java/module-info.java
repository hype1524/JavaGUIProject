module com.example.javaguiproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.javaguiproject to javafx.fxml;
    exports com.example.javaguiproject;
}