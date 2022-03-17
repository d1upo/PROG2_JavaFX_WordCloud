package ch.zhaw.prog2.application;

import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MainWindowController {

    @FXML
    private Button hinzufuegenText;

    @FXML
    private Label lableTitel;

    @FXML
    private Button leerenTextEingabe;

    @FXML
    private TextField textEingabe;

    @FXML
    private TextArea textHistory;

    @FXML
    void hinzufuegenText(ActionEvent event) {
        textHistory.setText(textHistory.getText() + textEingabe.getText() + System.lineSeparator());
    }

    @FXML
    void leerenTextEingabe(ActionEvent event) {
        textEingabe.clear();
    }

    @FXML
    void connectProperties() {
        lableTitel.textProperty().bind(textEingabe.textProperty());
    }

    @FXML
    void quit() {
        System.exit(0);
    }

}
