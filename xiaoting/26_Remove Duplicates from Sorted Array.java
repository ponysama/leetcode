class Solution {
    public int removeDuplicates(int[] nums) {
     //If the length is 0, the array is empty 
         int i = nums.length >0 ? 1:0;
        for(int n = 0; n < nums.length; n++){
            if(n>0 && nums[n] > nums[n-1])
                nums[i++] = nums[n];  
        }
    return i;
    }
}