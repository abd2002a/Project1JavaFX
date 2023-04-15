package Controller;

import View.ConversionView;
import View.ViewManager;
import javafx.scene.control.Alert;

public class ConversionController {
    private final ConversionView conversionView;
    private final ViewManager viewManager;

    public ConversionController(ConversionView conversionView, ViewManager viewManager) {
        this.conversionView = conversionView;
        this.viewManager = viewManager;
        initializeController();
    }

    private void initializeController() {
        // set action for convert button
        conversionView.getConvertButton().setOnAction(event -> {
            String dollarsStr = conversionView.getDollarsField().getText();
            String shekelsStr = conversionView.getShekelsField().getText();

            // convert dollars to shekels
            if (!dollarsStr.isEmpty() && shekelsStr.isEmpty()) {
                try {
                    double dollars = Double.parseDouble(dollarsStr);
                    double shekels = conversionView.convertDollarsToShekels(dollars);
                    conversionView.getShekelsField().setText(String.format("%.2f", shekels));
                } catch (NumberFormatException e) {
                    Alert alert = new Alert(Alert.AlertType.ERROR, "Please enter a valid number for dollars.");
                    alert.showAndWait();
                }
            }
            // convert shekels to dollars
            else if (dollarsStr.isEmpty() && !shekelsStr.isEmpty()) {
                try {
                    double shekels = Double.parseDouble(shekelsStr);
                    double dollars = conversionView.convertShekelsToDollars(shekels);
                    conversionView.getDollarsField().setText(String.format("%.2f", dollars));
                } catch (NumberFormatException e) {
                    Alert alert = new Alert(Alert.AlertType.ERROR, "Please enter a valid number for shekels.");
                    alert.showAndWait();
                }
            }
        });

        // set action for logout button
        conversionView.getLogoutButton().setOnAction(event -> {
            viewManager.switchToLoginView();
        });
    }
}
