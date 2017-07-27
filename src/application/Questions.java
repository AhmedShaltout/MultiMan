package application;

import java.net.URL;
import java.util.ResourceBundle;

import classes.MaltiMan;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;

public class Questions implements Initializable{
	@FXML Label l1,l2;
	@FXML ImageView wrong;
	@FXML TextField result;
	private int index,first,second;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		wrong.setImage(new Image("/pictures/wrong.png"));
		first=MaltiMan.num[index];
		second=Practice.table;
		l1.setText(Practice.table+"");
		l2.setText(first+"");
		result.addEventFilter(KeyEvent.KEY_TYPED,MaltiMan.numbers());
	}
	
	public void back(Event event){
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/design/practice.fxml"));
			Scene scene = new Scene(root);
			MaltiMan.window.setScene(scene);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void check(Event event){
		String r=result.getText();
		if(!r.equals("")){
			int resu=Integer.parseInt(r);
			result.setText("");
			if((first*second)==resu){
				wrong.setVisible(false);
				index++;
				first=MaltiMan.num[index];
				l2.setText(first+"");
				if(index==7){
					back(null);
				}
			}else{
				wrong.setVisible(true);
			}
		}
	}

}
