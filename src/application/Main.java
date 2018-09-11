package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application 
{
	public static String NF;
	@Override
	public void start(Stage primaryStage) 
	{
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/Stages/Main_Menu1.fxml"));
 
            primaryStage.setTitle("Тестирование");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
	
	

}
