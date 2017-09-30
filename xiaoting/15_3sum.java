class Solution {
    public  List<List<Integer>> threeSum(int[] nums) {
		 		   List<List<Integer>> ansList = new ArrayList<List<Integer>>();
		   Arrays.sort(nums);
		   int N = nums.length;
            for(int i = 0; i< N-2 && nums[i] <= 0; ++i) {
            		int j = i + 1; int l = N-1;
            		if (i > 0 && nums[i] == nums[i-1])
                        continue; // avoid duplicates
            		
    	   			while(j < l ) {
    	   				//System.out.println ("nums[i]: "+ nums[i] + "; nums[j]: " + nums[j]+";  nums[l]: " +  nums[l]);
    	   				int threesum = nums[j] + nums[i] + nums[l];
    	   				if(threesum > 0) --l;
    	   				else if(threesum < 0) ++j;
    	   				else {
    	   					ArrayList<Integer>  tmp = new ArrayList<Integer>();
	        	   			tmp.add(nums[i]); tmp.add(nums[j]); tmp.add(nums[l]);
	        	   				ansList.add(tmp);
	        	   			
	        	   		     ++j; --l;
	        	   		     while (j < l && nums[j] == nums[j-1]) ++j;  // avoid duplicates
	                     while (j < l && nums[l] == nums[l+1]) --l;  // avoid duplicates
	                     
    	   				    }
    	   				
    	   			}//end while			
           }//end for
        return ansList;
    }
}