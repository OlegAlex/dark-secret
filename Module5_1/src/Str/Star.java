package Str;

import javafx.scene.layout.Pane;

import java.util.ArrayList;

public class Star {
    private final int vertexCount;  // star's vertex count
    private final int circleCount;  // star's circle count
    private final Point center;   // star center
    private final int radius;       // star radius

    private ArrayList<MyLine> lineArrayList;

    public Star(int vertexCount, int circleCount, Point center, int radius) {
        this.vertexCount = vertexCount;
        this.circleCount = circleCount;
        this.center = center;
        this.radius = radius;
    }

    // draw star
    public void draw(Pane root) {
        if (lineArrayList == null) lineArrayList = linesFinder();

        for (MyLine line : lineArrayList) line.draw(root);
    }

    private ArrayList<MyLine> linesFinder() {
        // inner radius
        double inRadius = radius * Math.cos(Math.PI * circleCount / vertexCount) /
                Math.cos(Math.PI * (circleCount - 1) / vertexCount);

        // find all vertexes
        ArrayList<Point> vertexArrayList = new ArrayList<>();
        int angle = -90;

        for (int i = 0; i < vertexCount * circleCount; i++) {
            if (i % 2 == 0) {
                double tempX = center.getX() + inRadius * Math.cos(angle * Math.PI / 180);
                double tempY = center.getY() - inRadius * Math.sin(angle * Math.PI / 180);

                vertexArrayList.add(new Point(tempX, tempY));
            } else {
                double tempX = center.getX() + radius * Math.cos(angle * Math.PI / 180);
                double tempY = center.getY() - radius * Math.sin(angle * Math.PI / 180);

                vertexArrayList.add(new Point(tempX, tempY));
            }
            angle += 180 / vertexCount;
        }

        // find all sides
        ArrayList<MyLine> lines = new ArrayList<>();

        for (int i = 0; i < vertexArrayList.size() - 1; i++)
            lines.add(new MyLine(vertexArrayList.get(i), vertexArrayList.get(i + 1)));
        lines.add(new MyLine(vertexArrayList.get(0), vertexArrayList.get(vertexArrayList.size() - 1)));

        return lines;
    }

    // hide star
    public void clear(Pane root) {
        if (lineArrayList != null)
            for (MyLine line : lineArrayList)
                line.clear(root);
    }
}
