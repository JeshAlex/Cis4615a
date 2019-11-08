//rule: do not use floats as loop counters

public class Cis4615a {
	
    public static void main(String[] args) {

    	 for (float x = 0.1f; x < 1; x++) {
    		 System.out.println("This may work but is noncompliant");
    	 }
    	
    	}

  }

  


  
  

  