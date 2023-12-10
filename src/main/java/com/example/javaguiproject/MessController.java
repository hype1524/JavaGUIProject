package com.example.javaguiproject;

import javafx.fxml.FXML;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

import java.util.Objects;

public class MessController {
    @FXML
    private GridPane grid;
    @FXML
    private TextField text;
    @FXML
    private Button send;

    @FXML
    private VBox vbox;

    @FXML
    private void initialize() {
    }
    @FXML
    public void sendWord() {

    }

    @FXML
    public void setButton() {
        if (text.getText().isEmpty()) {
            Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("like.png")));
            ImageView imageView = new ImageView(image);
            send.setGraphic(imageView);
        } else {
            Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("send.png")));
            ImageView imageView = new ImageView(image);
            send.setGraphic(imageView);
        }
    }
}
