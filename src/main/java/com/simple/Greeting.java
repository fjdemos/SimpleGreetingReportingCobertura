package com.simple;




/**
 * Generate a unique number
 *
 */

public class Greeting 
{

    public static void main( String[] args )
    {
        Greeting msg = new Greeting();
       System.out.println(msg.getStatus());
    }
    
    /**
     * @return simple hard-coded message: GOOD
     */
    public String getStatus(){
    	
    	return "GOOD";
    	
    }
}
