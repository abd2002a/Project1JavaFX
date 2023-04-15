package JavaFX;

import View.ViewManager;
import javafx.application.Application;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        ViewManager viewManager = new ViewManager(stage);
        viewManager.switchToLoginView();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
