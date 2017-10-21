package Snow;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SnowmanInterface {
    private Snowman snowman;

    public void snowmanInterfaceInit (Pane root, Stage primaryStage) {
        TextField textCircleCount = new TextField();
        textCircleCount.setPromptText("Кол-во кругов");
        textCircleCount.setPrefColumnCount(15);
        textCircleCount.setTranslateX(10);
        textCircleCount.setTranslateY(10);

        TextField textMinRadius = new TextField();
        textMinRadius.setPromptText("Минимальный радиус");
        textMinRadius.setPrefColumnCount(15);
        textMinRadius.setTranslateX(10);
        textMinRadius.setTranslateY(45);

        TextField textMaxRadius = new TextField();
        textMaxRadius.setPromptText("Максимальный радиус");
        textMaxRadius.setPrefColumnCount(15);
        textMaxRadius.setTranslateX(10);
        textMaxRadius.setTranslateY(80);

        Label labelStatus = new Label("Введите параметры");
        labelStatus.setTranslateX(10);
        labelStatus.setTranslateY(115);

        // draw snowman
        Button showButton = new Button("Нарисовать");
        showButton.setTranslateX(225);
        showButton.setTranslateY(10);

        // draw in red
        Button drawInRedButton = new Button("Покрасить в красный");
        drawInRedButton.setTranslateX(225);
        drawInRedButton.setTranslateY(45);

        // draw gradient
        Button gradientButton = new Button("Gradient");
        gradientButton.setTranslateX(225);
        gradientButton.setTranslateY(80);

        // clear snowman
        Button clearButton = new Button("Очистить");
        clearButton.setTranslateX(225);
        clearButton.setTranslateY(115);

        root.getChildren().addAll(textCircleCount, textMinRadius, textMaxRadius, labelStatus,
                showButton, drawInRedButton, gradientButton, clearButton);

        showButton.setOnAction((ActionEvent event) -> {
            if (textCircleCount.getText() == null || textCircleCount.getText().isEmpty()) {
                labelStatus.setText("Введите кол-во кругов");
                return;
            }

            if (textMinRadius.getText() == null || textMinRadius.getText().isEmpty()) {
                labelStatus.setText("Введите минимальный радиус");
                return;
            }

            if (textMaxRadius.getText() == null || textMaxRadius.getText().isEmpty()) {
                labelStatus.setText("Введите максимальный радиус");
                return;
            }

            int circleCount = Integer.parseInt(textCircleCount.getText());
            int minRadius = Integer.parseInt(textMinRadius.getText());
            int maxRadius = Integer.parseInt(textMaxRadius.getText());

            if (snowman == null) snowman = new Snowman();

            snowman.clear(root);
            snowman.create(circleCount, minRadius, maxRadius);
            resize(primaryStage);
            snowman.draw(root);

            labelStatus.setText("Снеговик нарисован");
        });

        clearButton.setOnAction((ActionEvent event) -> {
            if (snowman != null) snowman.clear(root);

            labelStatus.setText("Снеговик удалён");
        });

        drawInRedButton.setOnAction((ActionEvent event) -> {
            if (snowman != null) snowman.changeColor(Color.RED);

            labelStatus.setText("Снеговик в красном");
        });

        gradientButton.setOnAction((ActionEvent event) -> {
            if (snowman != null) snowman.gradientColor();

            labelStatus.setText("Градиент");
        });
    }

    private void resize(Stage primaryStage) {
        if (snowman != null) {
            int[] size = snowman.size();

            primaryStage.setWidth(size[0]);
            primaryStage.setHeight(size[1]);
        }
    }
}
