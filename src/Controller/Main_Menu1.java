package Controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main_Menu1 
{
	@FXML
	private Button butMark;
	
	@FXML
	private Button butExit;

	@FXML
	private Button butStart;
	
	@FXML
	private Button butReg;
	
	
	public static Stage regStage=new Stage();
	public static Stage countOfExmplsStagee=new Stage();
	public static Stage way=new Stage();
	
	public void openWindowReg(ActionEvent event)
	{
		
		
		  try 
		  {
			 Parent root = FXMLLoader.load(getClass().getResource("/Stages/Reg_Stage1.fxml"));
 			 regStage.setTitle("Регистрация");
			 regStage.setScene(new Scene(root));
			 regStage.show();
		  } 
		  catch(Exception e) 
		  {
			e.printStackTrace();
		  }
		
		
	}
		
		public void openWindowStart(ActionEvent event)
		{
		  
		  if (Main.NF==null)
		  {
			  Alert alert=new Alert(Alert.AlertType.INFORMATION);
			  alert.setTitle("Введите Имя");
			  alert.setHeaderText(null);
			  alert.setContentText("Введите своё имя в окне,нажав кнопку 'Регистрация'");
			  alert.showAndWait();		 
		  }
		  else
		  {
			  try 
			  {
				 Parent root = FXMLLoader.load(getClass().getResource("/Stages/CountOfExamples.fxml"));
				 countOfExmplsStagee.setTitle("Кол-во");
				 countOfExmplsStagee.setScene(new Scene(root));
				 countOfExmplsStagee.show();
				

			  } 
			  catch(Exception e) 
			  {
				e.printStackTrace();
			  }
		  
		  }
		
	}
		
	public void Mark_Setup(ActionEvent ev)
	{
		 try 
		  {
			 Parent root = FXMLLoader.load(getClass().getResource("/Stages/Way_Results1.fxml"));
			 way.setTitle("Настройка шкалы");
			 way.setScene(new Scene(root));
			 way.show();
			

		  } 
		  catch(Exception e) 
		  {
			e.printStackTrace();
		  }
	}
	
	public void closeForm(ActionEvent e )
	{
		System.exit(0);
	}
	
	


}
