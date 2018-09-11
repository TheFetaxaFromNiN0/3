package Controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CountOfExamples
{
	@FXML
	private static Label instrLabel;
	
	public static Stage testWindow=new Stage();
	@FXML
	private Button OkBut;
	
	@FXML
	private TextField countExmplsField;
	public static Integer count=null;
	
	public static void setInstrLabel()
	{
		instrLabel.setText(Main.NF+", ������� ���-�� ��������");
	}
	
	public  void openTesWindow(ActionEvent e)
	{
		Main_Menu1.countOfExmplsStagee.close();
		try
		{
		count=Integer.parseInt(countExmplsField.getText());
		}
		catch (NumberFormatException eve)
		{
			  Alert alert=new Alert(Alert.AlertType.ERROR);
			  alert.setTitle("�������� ����");
			  alert.setHeaderText(null);
			  alert.setContentText("������� �����!");
			  alert.showAndWait();
			  countExmplsField.clear();
			  Main_Menu1.countOfExmplsStagee.showAndWait();
			 
			  
		}
		try 
		  {
			 Parent root = FXMLLoader.load(getClass().getResource("/Stages/Test_Window1.fxml"));
			 testWindow.setTitle("����");
			 testWindow.setScene(new Scene(root));
			 testWindow.show();
			

		  } 
		  catch(Exception ev) 
		  {
			ev.printStackTrace();
		  }
		
		
	}

}
