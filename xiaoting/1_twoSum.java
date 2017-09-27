class Solution {
    public int[] twoSum(int[] nums, int target) { 
        int[] indices = new int[2];
        for(int i = 0; i < nums.length; i++){
            
            
            for(int m = i + 1; m < nums.length; m++){
                
                if(target - nums[i] == nums[m]){
                   
                    indices[0] = i;
                    indices[1] = m;
                }//end if
            }//end for
        }//end for
        
        return indices;
    }//end method
}