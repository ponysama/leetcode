import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Leet8 {

	public static void main(String[] args) {
		System.out.println(myAtoi("  -32a1"));

	}
	
	 public static int myAtoi(String str) {
	     long ans = 0;
	     List<Character> list = new ArrayList<>();
	     char[] array = str.toCharArray();
	     boolean negative = false;
	     boolean found = false;
	     int counter  = 0;
	     
	     for(int i = 0; i < array.length; i ++) {
	    	 	
	    	 	if(Character.isDigit(array[i]) ||Character.isAlphabetic(array[i])) {
		    	    list.add(array[i]);
		    	    found = true;
	    	 	}
	    	 	else if(array[i] == '-') {
	    	 		negative = true;
	    	 		found = true;
	    	 		counter++;
	    	 	}
	    	 	else if(array[i] == '+'){
	    	 		counter++;
	    	 		found = true;
	    	 	}
	    	 	else if(array[i] == ' ' && found) {
	    	 		break;
	    	 	}
	     }
	     if(!list.isEmpty()) {
	    	 
	    	 StringBuilder result = new StringBuilder(list.size());
		     for (Character c : list) {
		       if(Character.isAlphabetic(c)) {
		    	   		break;
		       }
		       result.append(c);
		     }
		     String output = result.toString();
		     
		     //If longer than integer
		     if(output.length() > 10 ) {
			    	 if(negative == false) {
			    		 ans = Integer.MAX_VALUE;
			    	 }
			    	 else {
			    		 ans = Integer.MIN_VALUE;
			    	 }
		    	}  
		     else if(output.length() <= 10 && output.length()>0) {
			    	 ans = Long.valueOf(output).longValue();
			    	 if(negative==true) {
				    	 	ans = -ans;
				     }
			    	 if(ans > Integer.MAX_VALUE) {
			    		 ans = Integer.MAX_VALUE;
			    	 }
			    	 else if(ans < Integer.MIN_VALUE) {
			    		 ans = Integer.MIN_VALUE;
			    	 }
		     }
		   
	     }
	     if(counter>1) {
	    	 	ans = 0;
	     }
	     return (int) ans;
	    }


}
