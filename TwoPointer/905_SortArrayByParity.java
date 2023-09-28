class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while(i < j){
            if(nums[j] % 2 == 1)
            j--;
            else if(nums[i] % 2 == 0)
            i++;
            else if(nums[i] % 2 == 1){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }

        return nums;
    }
}
