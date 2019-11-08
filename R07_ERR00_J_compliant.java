import java.io.File;

//rule: do not suppress or ignore checked exceptions

public class Cis4615a {
	
    public static void main(String[] args) {
    	
    	boolean fileExists = false;
   
    	
    	try {
    		File f = new File("file.txt", "r");
    		fileExists = true;
    	}catch(NullPointerException e){
    		fileExists = false;
    		System.out.println("Error with file");
    		e.printStackTrace();
    		System.exit(1);//handles file error, tells user and exits program
    	}
    	
    	if(fileExists) {
    		System.out.println("File found");
    	}
    	
    	}
    }
  

