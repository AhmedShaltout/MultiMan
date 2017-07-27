package classes;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class MaltiMan extends Application {
	public static Stage window;
	public static int num[]={4,5,3,8,6,2,7,9};
	@Override
	public void start(Stage primary) {
		primary.setWidth(1218.5);
		primary.setHeight(747.0);
		primary.getIcons().add(new Image("/pictures/practice.png"));
		primary.setTitle("Multi-Man");
		window=primary;
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/design/starting.fxml"));
			Scene scene = new Scene(root);
			window.setScene(scene);
			window.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public static EventHandler<KeyEvent> numbers() {
	    return new EventHandler<KeyEvent>() {
	        @Override
	        public void handle(KeyEvent keyEvent) {
	        	TextField txt_TextField = (TextField) keyEvent.getSource();
	            if (txt_TextField.getText().length() >= 11) {                   
	            	keyEvent.consume();
	            }
                if (!"0123456789".contains(keyEvent.getCharacter())) {
                    keyEvent.consume();

                }
	        }
	    };
	}
}
