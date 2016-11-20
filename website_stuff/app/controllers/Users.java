package controllers;

import play.mvc.Http;
import play.mvc.Security;

//import play.mvc.*;
//import play.*;

public class Users {
	
	//public static boolean env;
	public static boolean envArray[] = new boolean[100];
	public static String mName[] = new String[100];
	public static String mPass[] = new String[100];
	public static String mActName[] = new String[100];
	
	public static void setName(String name){
		int i;
		for(i =0; i<100 && mName[i] != null; i++){
			if(mName[i] == name){
				//flipID();
				return;
			}
		}
		mName[i]= name;
		envArray[i] = false;
	}
	
	public static int getIndex(){
		nt i;
		Security.Authenticator mSA = new Security.Authenticator();
    		String name = mSA.getUsername(Http.Context.current());
		for(i =0; i<100 && mName[i] != name; i++);
		if(i>=100)
			return-1;
		else
			return i;
	}
	
	public static boolean getEnv(){
		int i = getIndex();
		boolean ret = envArray[i];
		//flipID();
		return ret;
	}
	
	public static void setEnv(boolean env){
		int i = getIndex();
		envArray[i] = env;	
	}
	
	public static String getPass(){
		int i = getIndex();
		String ret = mPass[i];
		//flipID();
		return ret;
	}
	
	public static void setPass(String pass){
		int i = getIndex();
		mPass[i] = pass;	
	}
	
	public static string getActName(){
		int i = getIndex();
		String ret = mActName[i];
		//flipID();
		return ret;
	}
	
	public static void setActName(String ActName){
		int i = getIndex();
		mActName[i] = ActName
	}
	
	/*public static void flipID(){
		int i;
		Security.Authenticator mSA = new Security.Authenticator();
    	String name = mSA.getUsername(Http.Context.current());
		for(i =0; i<100 && mName[i] != name; i++);
		if(envArray[i] == true)
			envArray[i] = false;
		else
			envArray[i] = true;
	}
	
	/*public static void flip(){
		if(env == true)
			env = false;
		else
			env = true;
	}*/

}
