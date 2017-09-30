class Solution {
    public boolean isPalindormic(String s1, String s2){
		 
		 StringBuilder sb =  new StringBuilder(s1);
		 sb = sb.reverse();
		 if(sb.toString().equals(s2)){
             //palindromic
			 return true;
         }//end if
		 return false;
		 
	 }
	 public String longestPalindrome(String s) {
	        
		   //overrun time limit, need improvement
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
	                 int length = sub.length();
	                 //If length is Even
	                 if(length%2 == 0){    
	                   String s1 = sub.substring(0, length/2), s2 = sub.substring(length/2, length);
                       if(isPalindormic(s1,s2)){
	                         //palindromic
	                         stringArrayList.add(sub);
	                         map.put(sub.length(),sub);
	                     }//end if
	                 }//end if
	                 //If length is Odd
	                 else{
	                     String s1 = sub.substring(0, length/2), s2 = sub.substring(length/2 +1, length);
	                     
	                     if(isPalindormic(s1,s2)){
	                         //palindromic
	                         stringArrayList.add(sub);
	                         map.put(sub.length(),sub);
	                     }//end if
	                 }//end else
	             }//end inner for
	        
	        }//end for
	            int count = 0;
	            for(String sr: stringArrayList){
	                
	                count = Math.max(sr.length(), count);
	            }//end for
	            return map.get(count);
	        }//end else
	        
	    }
}