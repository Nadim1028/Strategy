package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    AnchorPane canvas;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Line line = new Line(10,10, 300,300);
        Line line2 = new Line(10,10, 200,200);
        Line line3 = new Line(200,200, 300,300);
        canvas.getChildren().addAll(line,line2,line3);

       /* canvas.getChildren().add(line2);
        canvas.getChildren().add(line3);*/

       /* Polyline polyline = new Polyline();

        //Adding coordinates to the polygon
        polyline.getPoints().addAll(new Double[]{
                300.0, 50.0,
                200.0,50.0,
                250.0, 70.0,
                200.0, 50.0,

        });

        canvas.getChildren().add(polyline);*/

    }
}
