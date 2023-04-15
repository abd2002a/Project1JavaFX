package View;

import Controller.ConversionController;
import Controller.LoginController;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewManager {
    private final Stage stage;

    public ViewManager(Stage stage) {
        this.stage = stage;
    }

    public void switchToLoginView() {
        LoginView loginView = new LoginView();
        LoginController loginController = new LoginController(loginView, this);
        Scene scene = new Scene(loginView, 400, 600);
        scene.getStylesheets().add("/css/style.css");
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.show();
    }

    public void switchToConversionView() {
        ConversionView conversionView = new ConversionView();
        ConversionController conversionController = new ConversionController(conversionView, this);
        Scene scene = new Scene(conversionView, 550, 310);
        scene.getStylesheets().add("/css/Conver.css");
        stage.setScene(scene);
        stage.setTitle("Currency Change System");
        stage.show();
    }
}
