class Solution {
    public boolean isDecreasing(int[] nums){
        int mini = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(mini<nums[i])
            return false;

            mini = nums[i];
        }

        return true;
    }
    public boolean isIncreasing(int[] nums){
        int maxi = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            if(maxi>nums[i])
            return false;

            maxi = nums[i];
        }

        return true;
    }
    public boolean isMonotonic(int[] nums) {
        if(nums.length == 1)
        return true;

        return isDecreasing(nums) || isIncreasing(nums);
    }
}
