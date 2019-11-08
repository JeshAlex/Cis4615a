import java.math.BigInteger;

//do not encode noncharacters to strings

public class Cis4615a {

    public static void main(String[] args) {
    	
    	BigInteger x = new BigInteger("245345");
    	byte[] byteArray = x.toByteArray();
    	String s = new String(byteArray);
    	byteArray = s.getBytes();
    	x = new BigInteger(byteArray);
    	
		System.out.println(s);//prints invalid characters

        }

    }
  

