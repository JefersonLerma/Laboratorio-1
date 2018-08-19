package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ventana2TestController {

	public void clickBoton(ActionEvent evento) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Ventana1Test.fxml"));
			Scene scene = new Scene(root,400,200);
			Stage windows = (Stage)((Node)evento.getSource()).getScene().getWindow();
			windows.setScene(scene);
			windows.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
