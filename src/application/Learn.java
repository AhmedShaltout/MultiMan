package application;

import java.net.URL;
import java.util.ResourceBundle;

import classes.MaltiMan;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Learn implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
	public void mainMenu(Event event){
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/design/starting.fxml"));
			Scene scene = new Scene(root);
			MaltiMan.window.setScene(scene);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
