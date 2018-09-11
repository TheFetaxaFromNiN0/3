package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Way_Results1 
{
	@FXML
	private TextField text5;
	
	@FXML
	private TextField text4;
	
	@FXML
	private TextField text3;
	

	public static int five=80;
	public static int four=70;
	public static int three=60;
	public void Accept(ActionEvent e)
	{
		 five=(Integer.parseInt(text5.getText()));
		 four=Integer.parseInt(text4.getText());
		 three=Integer.parseInt(text3.getText());
		 Main_Menu1.way.close();
		 
		 
	}

}
