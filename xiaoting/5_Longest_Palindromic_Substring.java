class Solution {
    public static String longestPalindrome(String s) {
	        
	        int n = s.length();
	        ArrayList<String> stringArrayList = new ArrayList<String>();
	        Map<Integer, String> map = new HashMap();
	        if(n  == 1){
	            return s;
	        }
	        else{
	            for(int i = 0; i < n; i++){
	             for(int j = i; j < n; j++){
	                 
	                 String sub = s.substring(i,j+1);
	                 //System.out.println(sub);
	                 int length = sub.length();
	                 
	                 if(length%2 ==0){
	                     
	                     String s1 = sub.substring(0, length/2), s2 = sub.substring(length/2, length);
	                    // System.out.println(s1);
	                     StringBuilder sb =  new StringBuilder(s1);
	                
	                      sb = sb.reverse();
	               
	                     if(sb.toString().equals(s2)){
	                         
	                         //palindromic
	                    	
	                         stringArrayList.add(sub);
	                         map.put(sub.length(),sub);
	                     }//end if
	                     
	                 }//end if
	                 
	                 else{
	                     
	                     String s1 = sub.substring(0, length/2), s2 = sub.substring(length/2 +1, length);
	                      StringBuilder sb =  new StringBuilder(s1);
	                      //sb.append(s1);
	                      sb = sb.reverse();
	                     
	                      if(sb.toString().equals(s2)){
	                         
	                         //palindromic
	                    	 
	                         stringArrayList.add(sub);
	                         map.put(sub.length(),sub);
	                     }//end if
	                     
	                 }//end else
	                 
	             }//end inner for
	        
	            
	        }//end for
	            int count = 0;
	            
	            //Find the largest distinct substring
	            for(String sr: stringArrayList){
	                count = Math.max(sr.length(), count);
	            }//end for
	          
	            return map.get(count);
	        }//end else
	        
	    }
}