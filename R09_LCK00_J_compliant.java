//rule: Use private final locks to sync classes

public class Cis4615a {
	
	private final static Object lock = new Object();//locked object is private
	
    public static void main(String[] args) {

    	    changeVal();	
    	}
    
    public static void changeVal() {
    	synchronized(lock) {
    		
    		for(int x=2; x<3; x++) {
    			System.out.println("Lock is good");
    		}
    	}
    }
  }
  


  
  

  