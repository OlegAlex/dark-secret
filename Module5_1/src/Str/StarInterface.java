package Str;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class StarInterface {
    private static final int VERTEXCOUNT = 5; // star's vertex count
    private static final int CIRCLECOUNT = 2; // star's circle count

    private Star star;

    public void starInterfaceInit(Pane root) {
        TextField textCenterX = new TextField();
        textCenterX.setPromptText("X центра звезды");
        textCenterX.setPrefColumnCount(9);
        textCenterX.setTranslateX(10);
        textCenterX.setTranslateY(10);

        TextField textCenterY = new TextField();
        textCenterY.setPromptText("Y центра звезды");
        textCenterY.setPrefColumnCount(9);
        textCenterY.setTranslateX(10);
        textCenterY.setTranslateY(45);

        TextField textRadius = new TextField();
        textRadius.setPromptText("Радиус звезды");
        textRadius.setPrefColumnCount(9);
        textRadius.setTranslateX(10);
        textRadius.setTranslateY(80);

        Label labelStatus = new Label("Введите параметры");
        labelStatus.setTranslateX(10);
        labelStatus.setTranslateY(115);

        Button buttonDraw = new Button("Отрисовать");
        buttonDraw.setTranslateX(145);
        buttonDraw.setTranslateY(10);

        Button buttonClear = new Button("Очистить");
        buttonClear.setTranslateX(145);
        buttonClear.setTranslateY(45);

        Button buttonClose = new Button("Закрыть");
        buttonClose.setTranslateX(145);
        buttonClose.setTranslateY(80);

        root.getChildren().addAll(textCenterX, textCenterY, textRadius, labelStatus, buttonDraw, buttonClear, buttonClose);

        buttonDraw.setOnAction((ActionEvent event) -> {
            if (textCenterX.getText() == null || textCenterX.getText().isEmpty()) {
                labelStatus.setText("Введите X центра звезды");
                return;
            }

            if (textCenterY.getText() == null || textCenterY.getText().isEmpty()) {
                labelStatus.setText("Введите Y центра звезды");
                return;
            }

            if (textRadius.getText() == null || textRadius.getText().isEmpty()) {
                labelStatus.setText("Введите радиус звезды");
                return;
            }

            int centerX = Integer.parseInt(textCenterX.getText());
            int centerY = Integer.parseInt(textCenterY.getText());
            int radius = Integer.parseInt(textRadius.getText());

            drawStar(root, centerX, centerY, radius);

            labelStatus.setText("Звезда отрисована");
        });

        buttonClear.setOnAction((ActionEvent event) -> {
            clearStar(root);

            labelStatus.setText("Введите параметры");
        });

        buttonClose.setOnAction((ActionEvent event) -> {
            Platform.exit();
        });
    }


    private void drawStar(Pane root, int centerX, int centerY, int radius) {
        if (star == null) {
            Point center = new Point(centerX, centerY);
            star = new Star(VERTEXCOUNT, CIRCLECOUNT, center, radius);
        }

        clearStar(root);
        star.draw(root);
    }


    private void clearStar(Pane root) {
        if (star != null) star.clear(root);
    }
}
