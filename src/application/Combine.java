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


public class Combine implements Initializable{
	@FXML TextField num1,num2;
	@FXML ImageView wrong;
	@FXML Label result;
	private int r,in1,in2;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		wrong.setImage(new Image("/pictures/wrong.png"));
		r=MaltiMan.num[in1]*MaltiMan.num[in2];
		result.setText(r+"");
		num1.addEventFilter(KeyEvent.KEY_TYPED,MaltiMan.numbers());
		num2.addEventFilter(KeyEvent.KEY_TYPED,MaltiMan.numbers());
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
	
	public void check(Event event){
		String f=num1.getText(),s=num2.getText();
		if(f!=null&&s!=null&&!f.equals("")&&!s.equals("")){
			num2.setText("");
			num1.setText("");
			int x=Integer.parseInt(f),y=Integer.parseInt(s);
			if(x!=1&&y!=1&&(x*y)==r){
				wrong.setVisible(false);
				in2++;
				if(in2==8){
					in2=0;
					in1++;
					if(in1==8){
						try {
							Parent root = FXMLLoader.load(getClass().getResource("/design/starting.fxml"));
							Scene scene = new Scene(root);
							MaltiMan.window.setScene(scene);
							
						} catch(Exception e) {
							e.printStackTrace();
						}
					}
				}
				r=MaltiMan.num[in1]*MaltiMan.num[in2];
				result.setText(r+"");
				
			}else{
				wrong.setVisible(true);
			}
		}
	}
}
