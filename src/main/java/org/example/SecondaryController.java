package org.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");

    }

    @FXML
    private void switchToThirdnary() throws IOException {
        App.setRoot("thirdnary");

    }

}

