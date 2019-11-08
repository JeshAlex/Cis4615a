public class Cis4615a {

    public static void main(String[] args) {
    	
    	String username = "admin";
    	String password = "******";
    	Boolean login = true;
    	
    
        if(login) 
        {
        	System.out.println("Login Status: " + validate(username));
        	
        }
        }
		//simulates validation
    public static String validate(String user) {
    	if(user == "admin")
    	{
    		return "login successful for: "+ user;
    	}
    	else
    	{
    		return "invalid user";
    	}
    }
    }