package View;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class LoginView extends BorderPane {
    private TextField usernameField;
    private PasswordField passwordField;
    private Button loginButton;

    public LoginView() {
        initializeView();
    }

    private void initializeView() {
        // create UI components
        Image image = new Image("file:/Users/blal/IdeaProjects/JavaFX/Project1JavaFX/src/Image/pe.jpeg");

        // Create an ImageView object.
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(150);
        imageView.setFitWidth(200);

        // Put the ImageView in an HBox.


        Label usernameLabel = new Label("user name:");
        usernameField = new TextField();
        usernameField.setMaxWidth(200);
        usernameField.setMinHeight(40);

        Label passwordLabel = new Label("password:");
        passwordField = new PasswordField();
        passwordField.setMaxWidth(200);
        passwordField.setMinHeight(40);


        loginButton = new Button("Login");
        loginButton.setMaxWidth(80);
        loginButton.setMinHeight(40);

        // create layout
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(20));
        vbox.setAlignment(Pos.CENTER);

        vbox.getChildren().addAll(imageView, usernameLabel, usernameField, passwordLabel, passwordField, loginButton);

        setCenter(vbox);
    }

    // getters for the UI components
    public TextField getUsernameField() {
        return usernameField;
    }

    public PasswordField getPasswordField() {
        return passwordField;
    }

    public Button getLoginButton() {
        return loginButton;
    }

}
