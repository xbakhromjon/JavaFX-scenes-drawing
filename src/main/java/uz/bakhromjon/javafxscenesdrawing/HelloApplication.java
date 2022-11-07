package uz.bakhromjon.javafxscenesdrawing;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root, 700, 500, Color.LIGHTSKYBLUE);
        Text text = new Text();
        text.setText("Hello");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana", 50));
        text.setFill(Color.LIMEGREEN);

        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setOpacity(10);
        line.setRotate(45);

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(100);
        rectangle.setWidth(120);
        rectangle.setX(50);
        rectangle.setY(100);
        rectangle.setFill(Color.BLUE);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(5);

        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                200.0, 200.0,
                300.0, 300.0,
                200.0, 300.0
        );
        triangle.setFill(Color.YELLOW);

        Circle circle = new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50);
        circle.setFill(Color.ORANGE);

//        Image image = new Image("pizza.jpg");
//        ImageView imageView = new ImageView(image);
//        imageView.setX(400);
//        imageView.setY(400);

        root.getChildren().addAll(text, line, rectangle, triangle, circle);

        Stage stage = new Stage();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setMinHeight(500);
        stage.setMinWidth(500);
//        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}