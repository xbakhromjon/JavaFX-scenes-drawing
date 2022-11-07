module uz.bakhromjon.javafxscenesdrawing {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens uz.bakhromjon.javafxscenesdrawing to javafx.fxml;
    exports uz.bakhromjon.javafxscenesdrawing;
}