//rule: ensure visibility of shared references to immutable objects

public class Cis4615a {
	
	private static int num = 10;
	
    public static void main(String[] args) {
    	
    	System.out.println(getNum());
    	System.out.println(setNum());
    	System.out.println(getNum());
    	    	
    	}
    
    public static int getNum() {
    	
    	return num;
    }
    
    public static int setNum() { //should be synchronized especially if multi-threading
    	
    	num = 15;
    	return num;
    }
    
    }
  