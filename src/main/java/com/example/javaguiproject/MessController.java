package com.example.javaguiproject;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.geometry.HPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.util.Duration;

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
        if (text.getText().isEmpty()) {
            GridPane gridPane = new GridPane();
            gridPane.setPrefWidth(grid.getPrefWidth());

            RowConstraints rowConstraints = new RowConstraints();
            rowConstraints.setPercentHeight(100);
            gridPane.getRowConstraints().add(rowConstraints);

            ColumnConstraints column1 = new ColumnConstraints();
            column1.setPercentWidth(80);
            ColumnConstraints column2 = new ColumnConstraints();
            column2.setPercentWidth(20);
            gridPane.getColumnConstraints().addAll(column1, column2);

            BorderPane borderPane = new BorderPane();

            GridPane.setColumnIndex(borderPane, 1);
            GridPane.setRowIndex(borderPane, 0);
            GridPane.setHalignment(borderPane, HPos.RIGHT);

            Label label = new Label();

            Image image = new Image(Objects.requireNonNull(getClass()
                    .getResourceAsStream("like.png")));
            ImageView imageView = new ImageView(image);

            label.setGraphic(imageView);
            borderPane.setCenter(label);
            gridPane.getChildren().add(borderPane);

            vbox.getChildren().add(gridPane);
            text.setText(null);
        } else {
            GridPane gridPane = new GridPane();
            gridPane.setPrefWidth(grid.getPrefWidth());

            RowConstraints rowConstraints = new RowConstraints();
            rowConstraints.setPercentHeight(100);
            gridPane.getRowConstraints().add(rowConstraints);

            ColumnConstraints column1 = new ColumnConstraints();
            column1.setPercentWidth(60);
            ColumnConstraints column2 = new ColumnConstraints();
            column2.setPercentWidth(40);
            gridPane.getColumnConstraints().addAll(column1, column2);

            BorderPane borderPane = new BorderPane();
            borderPane.setStyle("-fx-background-color: #ADD8E6;" +
                    " -fx-background-radius: 10 0 10 10");

            GridPane.setColumnIndex(borderPane, 1);
            GridPane.setRowIndex(borderPane, 0);
            GridPane.setHalignment(borderPane, HPos.RIGHT);

            Label label = new Label(text.getText());
            label.setStyle("-fx-padding: 10;");
            borderPane.setCenter(label);
            gridPane.getChildren().add(borderPane);

            vbox.getChildren().add(gridPane);
            text.setText(null);
            Image image = new Image(Objects.requireNonNull(getClass()
                    .getResourceAsStream("like.png")));
            ImageView imageView = new ImageView(image);
            send.setGraphic(imageView);

            Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(5), event -> {
                reply();
            }));
            timeline.play();
        }
    }

    private void reply() {
        GridPane gridPane = new GridPane();
        gridPane.setPrefWidth(grid.getPrefWidth());

        RowConstraints rowConstraints = new RowConstraints();
        rowConstraints.setPercentHeight(100);
        gridPane.getRowConstraints().add(rowConstraints);

        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(40);
        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPercentWidth(60);
        gridPane.getColumnConstraints().addAll(column1, column2);

        BorderPane borderPane = new BorderPane();
        borderPane.setStyle("-fx-background-color: #FFB6C1;" +
                " -fx-background-radius: 0 10 10 10");

        GridPane.setColumnIndex(borderPane, 0);
        GridPane.setRowIndex(borderPane, 0);
        GridPane.setHalignment(borderPane, HPos.LEFT);

        Label label = new Label("Shut up!");
        label.setStyle("-fx-padding: 10;");
        borderPane.setCenter(label);
        gridPane.getChildren().add(borderPane);

        vbox.getChildren().add(gridPane);
    }

    @FXML
    public void setButton() {
        if (text.getText().isEmpty()) {
            Image image = new Image(Objects.requireNonNull(getClass()
                    .getResourceAsStream("like.png")));
            ImageView imageView = new ImageView(image);
            send.setGraphic(imageView);
        } else {
            Image image = new Image(Objects.requireNonNull(getClass()
                    .getResourceAsStream("send.png")));
            ImageView imageView = new ImageView(image);
            send.setGraphic(imageView);
        }
    }
}
