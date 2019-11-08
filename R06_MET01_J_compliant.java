//rule: do not validate method args with asserts

public class Cis4615a {

	static int MIN = 0;
	static int MAX = 100;
	
    public static void main(String[] args) {
    	
    	int x = 25;
    	int y = 50;
    	
    	System.out.println(add(x,y));
    	
        }
    
    public static int add(int x, int y) {
    	
    	if(x == MIN || x == MAX) {
    		throw new IllegalArgumentException();
    	}
    	if(y == MIN || y == MAX) {
    		throw new IllegalArgumentException();
    	}
    	
    	return x+y;
    }

    }
  

  
