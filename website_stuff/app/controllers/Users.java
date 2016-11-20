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
				flipID();
				return;
			}
		}
		mName[i]= name;
		envArray[i] = false;
	}
	
	public static boolean envFind(){
		int i;
		Security.Authenticator mSA = new Security.Authenticator();
    	String name = mSA.getUsername(Http.Context.current());
		for(i =0; i<100 && mName[i] != name; i++);
		boolean ret = envArray[i];
		flipID();
		return ret;
	}
	
	public static void flipID(){
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
