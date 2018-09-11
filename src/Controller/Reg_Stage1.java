package Controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Reg_Stage1
{
	@FXML
	private Button okForName;
 
	@FXML
	private TextField fieldForName;
	
	public void acceptName (ActionEvent e)
	{
		Main.NF=fieldForName.getText();
		Main_Menu1.regStage.close();
	}
	
}