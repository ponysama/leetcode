class Solution {
    public int removeElement(int[] nums, int val) {
    /**
     * @param A: array of integers, value to remove
     * @return : return an integer, length of the new array
     */
    int j = 0;
        for(int i: nums){
            if(i!=val)
                nums[j++] = i;
        }
        return j;
        
    }
}