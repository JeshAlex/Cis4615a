//rule: ensure visibility of shared references to immutable objects

public class Cis4615a {
	
	private static int num = 10;
	
    public static void main(String[] args) {
    	
    	System.out.println(getNum());
    	System.out.println(setNum());
    	System.out.println(getNum());
    	    	
    	}
    
    public synchronized static int getNum() {
    	
    	return num;
    }
    
    public synchronized static int setNum() { //synchronized methods
    	
    	num = 15;
    	return num;
    }
    
    }
  

  