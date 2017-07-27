package application;

import java.net.URL;
import java.util.ResourceBundle;

import classes.MaltiMan;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

public class Starting implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
	
	public void learn(Event event){
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/design/learn.fxml"));
			Scene scene = new Scene(root);
			MaltiMan.window.setScene(scene);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void practice(Event event){
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/design/practice.fxml"));
			Scene scene = new Scene(root);
			MaltiMan.window.setScene(scene);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void combine(Event event){
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/design/combine.fxml"));
			Scene scene = new Scene(root);
			MaltiMan.window.setScene(scene);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	public void dark(Event event){
		((Button)event.getSource()).setStyle("-fx-border-width: 3px;");
	}
	
	public void light(Event event){
		((Button)event.getSource()).setStyle("-fx-border-width: 1px;");
	}
}
