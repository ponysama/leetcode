class Solution {
     public List<List<Integer>> fourSum(int[] nums, int target) {
        int N = nums.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (N < 4) return res;
        Arrays.sort(nums);
        for (int i = 0; i < N; ++i)
        {
            if (i > 0 && nums[i] == nums[i-1]) continue; // avoid duplicates
            for (int j = i+1; j < N; ++j)
            {
                if (j > i+1 && nums[j] == nums[j-1]) continue; // avoid duplicates
                int twosum = target - nums[i] - nums[j];
                int l = j + 1, r = N - 1;
                while (l < r)
                {
                    int sum = nums[l] + nums[r];
                    if (sum == twosum) {
                    ArrayList<Integer> tmp = new ArrayList<Integer>();
                    tmp.add(nums[i]); tmp.add(nums[j]); tmp.add(nums[l]); tmp.add(nums[r]);
                    res.add(tmp);
                        while (l < r && nums[l+1] == nums[l]) l++; // avoid duplicates
                        while (l < r && nums[r-1] == nums[r]) r--; // avoid duplicates
                        l++; r--;
                    }
                    else if (sum < twosum) l++;
                    else r--;
                }
            }
        }
        return res;
    }
}