module com.example.judy_project {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.judy_project to javafx.fxml;
    exports com.example.judy_project;
}