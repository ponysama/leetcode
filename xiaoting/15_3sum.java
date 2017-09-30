import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Snippet {
	

	public static void main(String[] args) {
		int[] array = {-1, 0, 1, 2, -1, -4};
		System.out.println(threeSum(array));

	}
	
	   public static ArrayList<ArrayList<Integer>> threeSum(int[] nums) {
		 //Find the list that 
	       // List<List<Integer>> ansList = new ArrayList<ArrayList<Integer>>();
	         //Find the list that 
			  
		   ArrayList<ArrayList<Integer>> ansList = new ArrayList<ArrayList<Integer>>();
			    
			    Map<Integer, Integer> map1 = new HashMap<>();
			    Map<Integer, Integer> map2 = new HashMap<>();
		           for(int i = 0; i< nums.length; i++) {
		        	   map1.put(nums[i], i);
		        	   	for(int j = i+1; j < nums.length; j++) {
		        	   		
		        	   		int complement = 0 -nums[j]-nums[i];
		        	   		if(map2.containsKey(complement)&& j != map2.get(complement) && i < map2.get(complement)) {
		        	   			//found complement
		        	   		    ArrayList<Integer>  innerList = new ArrayList<>();
		        	   		    
		        	   			innerList.add(nums[i]);
		        	   			innerList.add(nums[j]);
		        	   			innerList.add(complement);
		        	   		    Collections.sort(innerList);
		        	   			
		        	   			if(!ansList.contains(innerList)) {
		        	   				ansList.add(innerList);
		        	   			}
		        	   			
		        	   			//No duplicate
		        	   		}
		        	   		
		        	   		map2.put(nums[j], j);
		        	   		
		        	   	}//end for
		        	   
		           }
		        
		        return ansList;
		        
	   }
}