import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestLeet3 {
	
	//Time limit exceed O(n^3)
    //this one didn't pass the test
    public static void main(String[] args)
	{
        System.out.println( lengthOfLongestSubstring("bbbbb"));
	}
    public static int lengthOfLongestSubstring(String s) {
        
        //First all substrings without reapted characters
        
        char[] chArray = s.toCharArray();
        ArrayList<String> stringArrayList = new ArrayList<String>();
        //System.out.println(s.substring(0,0));
        //System.out.println(s.substring(0,2));
        if(chArray.length == 1){
    		
    		return 1;
    	}
        else{
        	
        	 //Find distinct substring
            for(int i = 0; i < chArray.length; i ++){
                for(int j = i; j < chArray.length; j++){
                   //Add the subarray with non-repeated char into the list
                   //Get the non-repeated substring
                	Set<Character> characters = new TreeSet<Character>();
                    String subString = s.substring(i,j+1);
                   
                    
                    char[] subChar = subString.toCharArray();
                    
                     for(int m = 0; m< subChar.length; m++){
                       characters.add(subChar[m]); 
                       
                     }//end for
                   
                    if(subChar.length == characters.size()){
                	  
                    	//If true, every character in the sub string is distinct
                          stringArrayList.add(subString); 
                          Iterator iter = characters.iterator();
                          while (iter.hasNext()){
                          	 System.out.println(iter.next());
                          	
                          }
                          
                          System.out.println(subString);
                   }//end if
                 }//end inner for  
                
            }//end for
            int count = 0;
            //Find the largest distinct substring
            for(String sr: stringArrayList){
               
                if(sr.length() > count){
                    
                    count = sr.length();
                }
                
            }//end for
            
            return count;
        }//end else
        
  
       
    }

}
