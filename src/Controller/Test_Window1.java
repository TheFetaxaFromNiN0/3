package Controller;

import java.util.ArrayList;
import java.util.Random;

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
import Controller.CountOfExamples;
import application.AnswerArray;

public class Test_Window1 
{
	@FXML
	private Label explField;
	
	@FXML
	private Button nextExampBut;
	
	@FXML
	private TextField desField;
	
	@FXML
	private Button StartBut;
	private Stage results=new Stage();
	
	
	int i=0;
	
	public static AnswerArray answer=new AnswerArray();
	public static int count_here=CountOfExamples.count;
	
    public void StartTest(ActionEvent e)
    {
    	int c=0;
    	Random rn=new Random();
	    int a=rn.nextInt(9);
	    int b=rn.nextInt(9);
	    explField.setText(a+"*"+b+"= ?");
	    c=a*b;
        answer.curAnseres.add(c);
        answer.ex.add(a+"*"+b+"=");
        nextExampBut.setVisible(true);
        StartBut.setVisible(false);
       
	   
    }
	
	public void Mult(ActionEvent ev)
	{
		int stAnswer=0,c=0;
		
		if ((i<count_here) )
		{
			 try
			    {
			    	
			   	
			    		stAnswer=Integer.parseInt(desField.getText());
				        answer.stAnswer.add(stAnswer);
				
		
			    }
			    catch (NumberFormatException eve)
			    {
				  Alert alert1=new Alert(Alert.AlertType.ERROR);
				  alert1.setTitle("Неверный ввод");
				  alert1.setHeaderText(null);
				  alert1.setContentText("Введите число!");
				  alert1.showAndWait();
				  desField.clear();
				 
			    }
				
			Random rn=new Random();
		    int a=rn.nextInt(9);
		    int b=rn.nextInt(9);
		    explField.setText(a+"*"+b+"= ?");
		    c=a*b;
	        answer.curAnseres.add(c);
	        answer.ex.add(a+"*"+b+"=");
	        i++;
	        }
			
		   
		    desField.clear();
		   
		
		if (i==count_here)
		{
			try 
			  {
				 Parent root = FXMLLoader.load(getClass().getResource("/Stages/Results1.fxml"));
				 results.setTitle("Результат");
				 results.setScene(new Scene(root));
				 results.show();
				

			  } 
			  catch(Exception eу) 
			  {
				eу.printStackTrace();
			  }
			 CountOfExamples.testWindow.close();
		}
		 
	}
	
}


