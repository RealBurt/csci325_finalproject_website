package models;

import play.*;
import play.db.*;

import javax.persistance.*;
import java.util.*;

@Entity
public class Question extends Model{
	public String mAsk;
	public String mAnswr[];
	public int mCorrect;
	
	public Question(String Ask, String Answr[], int Correct){
		mAsk = new String(Ask.toString());
		mAnswr = new String[10];
		for(int i = 0; Answr[i] != null; i++){
			mAnswr[i] = new String(Answr[i].toString());
		}
		mCorrect = Correct;
	}
	
	public boolean Eval(int chosen){
		return (chosen == mCorrect);
	}

}
