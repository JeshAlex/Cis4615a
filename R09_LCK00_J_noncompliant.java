//rule: Use private final locks to sync classes

public class Cis4615a {
	
	public final static Object lock = new Object();//locked objects should be private
	
    public static void main(String[] args) {

    	    changeVal();	
    	}
    
    public static void changeVal() {
    	synchronized(lock) {
    		
    		for(int x=2; x<3; x++) {
    			System.out.println("Lock should be private");
    		}
    	}
    }
  }
  
  

  