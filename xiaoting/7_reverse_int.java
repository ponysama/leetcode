import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leet7 {

	public static void main(String[] args) {
		
		System.out.println(reverse(4));
	}
	 public static int reverse(int x) {
	       
	        String s = Integer.toString(x);
	        char[] array = s.toCharArray();
	        long ans = 0;
	        if(array.length == 1) {
	        	
	        	ans = (int) x;
	        }
	        else {
	        	
	     
	        if(s.charAt(0) == '-'){
	            for(int i = 1; i< ((array.length-1)/2) + 1; i++){   
	            	 //switch
            		char temp = array [i];
                array[i] = array[array.length-i]; 
                array[array.length-i] = temp;
                ans = Long.valueOf(new String(array)).longValue();
                if(ans < -Integer.MIN_VALUE) {
                		ans  = 0;
                }
	            }
	        
	        }//end if
	        else{
	            
	            for(int i = 0; i< array.length/2; i++){
	                //switch
	            		char temp = array [i];
	                array[i] = array[array.length-i-1]; 
	                array[array.length-i-1] = temp;
	                ans = Long.valueOf(new String(array)).longValue();
	                if(ans > 2147483647 ) {
	                	ans  = 0;
	                }
	            }
	        }//end else
	        }
	       return (int) ans;
	    }
}
