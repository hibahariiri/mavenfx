package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class LægeopretjournalController {

    @FXML
    public void switchtolægevalg(ActionEvent actionEvent) throws IOException {
        App.setRoot("Lægevalg");


    }

}
