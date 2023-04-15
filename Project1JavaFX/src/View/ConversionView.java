package View;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ConversionView extends BorderPane {
    private static TextField dollarsField;
    private static TextField shekelsField;
    private Button convertButton;
    private Button logoutButton;

    public ConversionView() {
        initializeView();
    }

    private void initializeView() {
        // create UI components
        Label titleLabel = new Label("Currency Conversion System");
        titleLabel.setAlignment(Pos.CENTER);

        Label dollarsLabel = new Label("USD");
        dollarsField = new TextField();
        dollarsField.setMaxWidth(160);
        dollarsField.setMinHeight(30);

        Label shekelsLabel = new Label("NIS");
        shekelsField = new TextField();
        shekelsField.setMaxWidth(160);
        shekelsField.setMinHeight(30);

        Label labelTo = new Label("TO");
        labelTo.setId("to");
        convertButton = new Button("Convert");
        convertButton.setId("con");
        convertButton.setMinWidth(100);
        convertButton.setMinHeight(50);

        logoutButton = new Button("Log out");
        logoutButton.setMinWidth(70);
        logoutButton.setMinHeight(20);
        // create layout
        HBox hbox = new HBox();
        hbox.setSpacing(150);
        hbox.setPadding(new Insets(20));
        hbox.getChildren().addAll(titleLabel, logoutButton);
        setCenter(hbox);


        HBox hBox1 = new HBox();
        hBox1.setSpacing(200);
        hBox1.getChildren().addAll(dollarsLabel , shekelsLabel);
        hBox1.setAlignment(Pos.CENTER);
        setCenter(hBox1);


        HBox hBox2 = new HBox();
        hBox2.setSpacing(30);
        hBox2.getChildren().addAll(dollarsField, labelTo,shekelsField);
        hBox2.setAlignment(Pos.CENTER);
        setCenter(hBox2);

        VBox vBox = new VBox(10,hBox1 , hBox2);

        HBox hBox3 = new HBox();
        hBox3.setAlignment(Pos.CENTER);
        hBox3.getChildren().addAll(convertButton);
        setCenter(hBox3);


        VBox vBox2 = new VBox(30 , hbox , vBox , hBox3);
        HBox hBox4 = new HBox();
        hBox4.setAlignment(Pos.CENTER);
        hBox4.getChildren().addAll(vBox2);
        setCenter(hBox4);
    }

    // getters for the UI components
    public static TextField getDollarsField() {
        return dollarsField;
    }

    public static TextField getShekelsField() {
        return shekelsField;
    }

    public Button getConvertButton() {
        return convertButton;
    }

    public Button getLogoutButton() {
        return logoutButton;
    }
    public double convertDollarsToShekels(double dollarsAmount) {
        double shekelsAmount = CurrencyConverter.convertToILS(dollarsAmount);
        ConversionView.getShekelsField().setText(String.format("%.2f", shekelsAmount));
        return shekelsAmount;
    }
    public double convertShekelsToDollars(double shekelsAmount) {
        double dollarsAmount = CurrencyConverter.convertToUSD(shekelsAmount);
        ConversionView.getDollarsField().setText(String.format("%.2f", dollarsAmount));
        return dollarsAmount;
    }
}
