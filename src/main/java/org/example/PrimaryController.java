package org.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Polyline;

public class PrimaryController {
@FXML
public Polyline polyline;


    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    public void switchtolægelogin(ActionEvent actionEvent) throws IOException {
        App.setRoot("Lægelogin");
    }
    @FXML
    public void switchtosundlogin(ActionEvent actionEvent) throws IOException {
        App.setRoot("sundlogin");
}
}
