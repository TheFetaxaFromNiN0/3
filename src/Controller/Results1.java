package Controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Results1 
{
	@FXML
	private TextArea resultText;

	@FXML
	private Button endBut;

	@FXML
	private Button showRes;
	
	public void EndResult(ActionEvent e)
	{

		int k=0;
		int fl;
		String  str;
		int stRes;
		String STR="";
		STR=Main.NF+" ,твои результаты :  \r\n";
		for(int i=0;i<Test_Window1.count_here;i++)
		{
			fl=Test_Window1.answer.curAnseres.get(i);
			str=Test_Window1.answer.ex.get(i);
			stRes=Test_Window1.answer.stAnswer.get(i);
			
			if (stRes==fl)
				{
				  STR=STR+str+stRes+"- верно \r\n ";
			      k++;
			    }
			if (stRes!=fl)
				STR=STR+str+stRes+"- неверно \r\n ";
			
		}
		float score=(int)( k/CountOfExamples.count)*100;
		if (score>=Way_Results1.five) {
			STR = STR + "ќтлично! ќценка 5!";
		}
				else
		if ((score>=Way_Results1.four)&&(score<=Way_Results1.five)) {
			STR = STR + "’орошо! ќценка 4!";
		}

				else
		if ((score>=Way_Results1.three)&&(score<=Way_Results1.four)) {
			STR = STR + "—ойдет! ќценка 3!";
		}
		else
		if (score<=Way_Results1.three)
			STR=STR+"ѕлохо! ќценка 2!";
		
		resultText.setText(STR);
		Test_Window1.answer.ex.clear();
		Test_Window1.answer.stAnswer.clear();
		Test_Window1.answer.curAnseres.clear();
		STR="";
		showRes.setDisable(true);

		
	}
	
	public void End(ActionEvent e)
	{
		System.exit(0);
	}
}
