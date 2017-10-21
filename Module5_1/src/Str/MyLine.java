package Str;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

public class MyLine {
    private Point p1, p2;
    private Line line;

    public MyLine(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void draw(Pane root) {
        if (line == null) {
            line = new Line();
            root.getChildren().addAll(line);
        }

        line.setStartX(p1.getX());
        line.setStartY(p1.getY());

        line.setEndX(p2.getX());
        line.setEndY(p2.getY());
    }

    // стирает себя (линию)
    public void clear(Pane root) {
        if (line != null) {
            root.getChildren().remove(line);
            line = null;
        }
    }
}
