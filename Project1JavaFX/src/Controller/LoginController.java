package Controller;

import View.LoginView;
import View.ViewManager;
import javafx.scene.control.Alert;

public class LoginController {
    private final LoginView loginView;
    private final ViewManager viewManager;

    public LoginController(LoginView loginView, ViewManager viewManager) {
        this.loginView = loginView;
        this.viewManager = viewManager;
        initializeController();
    }

    private void initializeController() {
        // set action for login button
        loginView.getLoginButton().setOnAction(event -> {
            String username = loginView.getUsernameField().getText();
            String password = loginView.getPasswordField().getText();

            // check if username and password are correct
            if (username.equals("abd") && password.equals("123")) {
                viewManager.switchToConversionView();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR, "Invalid username or password.");
                alert.showAndWait();
            }
        });
    }
}

