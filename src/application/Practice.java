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

public class Practice implements Initializable {
	public static int table;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	public void practice(Event event){
		String id=((Button)event.getSource()).getId();
		if(id.equals("p2")){
			table=2;
		}else if(id.equals("p3")){
			table=3;
		}else if(id.equals("p4")){
			table=4;
		}else if(id.equals("p5")){
			table=5;
		}else if(id.equals("p6")){
			table=6;
		}else if(id.equals("p7")){
			table=7;
		}else if(id.equals("p8")){
			table=8;
		}else{
			table=9;
		}
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/design/questions.fxml"));
			Scene scene = new Scene(root);
			MaltiMan.window.setScene(scene);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
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
	
	public void dark(Event event){
		((Button)event.getSource()).setStyle("-fx-border-width: 3px;");
	}
	
	public void light(Event event){
		((Button)event.getSource()).setStyle("-fx-border-width: 1px;");
	}

}
