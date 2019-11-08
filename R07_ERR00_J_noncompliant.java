import java.io.File;

//rule: do not suppress or ignore checked exceptions

public class Cis4615a {
	
    public static void main(String[] args) {
    	
    	boolean fileExists = true;
   
    	
    	try {
    		File f = new File("file.txt", "r");
    		
    	}catch(NullPointerException e){
    		e.printStackTrace();//does not do anything if file not found
    	}
    	
    	if(fileExists) {
    		System.out.println("File found");
    	}
    	
    	}
    }
  
