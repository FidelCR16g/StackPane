package com.example.stackpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        Circle circulo = new Circle(100);
        circulo.setFill(Color.LIGHTBLUE);
        circulo.setStroke(Color.DARKBLUE);

        Rectangle rectangulo = new Rectangle(180, 120);
        rectangulo.setFill(Color.LIGHTGREEN);
        rectangulo.setStroke(Color.DARKGREEN);

        Polygon triangulo = new Polygon();
        triangulo.getPoints().addAll(0.0, -70.0, 60.0, 50.0, -60.0, 50.0);
        triangulo.setFill(Color.LIGHTCORAL);
        triangulo.setStroke(Color.DARKRED);

        Text texto = new Text("UV");
        texto.setStyle("-fx-fill:white; -fx-font-size:24px");

        StackPane root = new StackPane();
        root.getChildren().addAll(circulo, rectangulo, triangulo, texto);

        Scene scene = new Scene(root, 400, 400);
        stage.setTitle("Visualización de Capas como Enzimas");
        stage.setScene(scene);
        stage.show();

        /*
        Apila componentes uno encima de otro, se usa para botones personalizados, botones con notificacion,
        para fondo con capas, logos de empresas, y para interfaces en videojuegos :0. Una caracteristica es que
        se centra automaticamente, es flexible para combinar imagenes, formas, texto, y controles en un solo
        elemento.
         */
    }

    public static void main(String[] args) {
        launch(args);
    }
}