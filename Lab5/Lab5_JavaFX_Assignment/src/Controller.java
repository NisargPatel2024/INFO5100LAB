
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nisarg
 */
public class Controller {
    @FXML
    TextField nameTextField, ageTextField, emailTextField;

    public void submit(ActionEvent event) {
        
        String name = nameTextField.getText();
        String age = ageTextField.getText();
        String email = emailTextField.getText();
        
//        checking age value is valid or not.
        try {
            int ageValue = Integer.parseInt(age);
            if (ageValue < 0 || ageValue > 120) {
                showErrorAlert("Invalid Age", "Please enter a valid age between 0 and 120.");
                return;
            }
        } catch (NumberFormatException e) {
            showErrorAlert("Invalid Age", "Please enter a valid number for age.");
            return;
        }
        
//        check email is valid or not.
        if (!isValidEmail(email)) {
            showErrorAlert("Invalid Email", "Please enter a valid email address.");
            return;
        }

//        Creating alert 
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Submitted");
        alert.setHeaderText("Thank you");
        alert.setContentText("Submitted Details: \n\nName: " + name + "\nAge: " + age + "\nEmail: " + email);
        alert.showAndWait();
        
        System.out.println("Submitted");

    }
    
    private void showErrorAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    
    private boolean isValidEmail(String email) {
        
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }
}
