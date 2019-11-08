//rule: don't ignore returned values
public class Cis4615a {

    public static void main(String[] args) {
    	
    	String name = "";
    	
    	name = getName();//stores returned value
    	
    	if(name != "")
    	{
    		System.out.println("Hello " + name);
    	}
    	
        }
    public static String getName() {
    	return "Bob";
    }
    }
  


