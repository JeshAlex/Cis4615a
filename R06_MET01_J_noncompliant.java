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
    	
    	assert x != MIN;
    	assert x != MAX;
    	assert y != MIN;
    	assert y != MAX; //example of how not to validate args
    	
    	return x+y;
    }

    }
  
