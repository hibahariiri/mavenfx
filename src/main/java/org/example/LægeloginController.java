package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class LægeloginController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    @FXML
    public void switchtolægelogin(ActionEvent actionEvent) throws IOException {
        App.setRoot("Lægelogin");
    }

    @FXML
    public void switchtolægevalg(ActionEvent actionEvent) throws IOException {
        App.setRoot("Lægevalg");
    }


}
