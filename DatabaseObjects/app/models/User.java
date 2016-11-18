package models;


import play.*;
import play.db.*;
import play.data.validation.*;

import javax.persistance.*;
import java.util.*;

@Entity
public class User extends Model{
	
	@Required
	public String mName;
	public int    mScore;
	
	public User(String Name, int score){
		mName = new String(Name.toString());
		mScore = score;
	}
	
	public String toString(){
		return (mName.toString() + " " + mScore);
	}
	
	

}
