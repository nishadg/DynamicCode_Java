package edu.uci.seal.icc;

import android.content.Context;
import android.content.Intent;

public class HiddenBehavior {
    public Intent getIntent(String componentType){
    	Intent i = new Intent("edu.uci.seal.action.SEND_SMS");
    	return i;
    }
    public void startComponentExplicit(Context context, String componentType, Intent intent){
    	//you can use the Context to start a component with the given Intent 
    	
    }
    public void startComponentImplicit(Context context, String componentType, String action){
    	//you can use the Context to start a component with the given action
    	//make sure to create an Intent from that action
    	
    }

}
