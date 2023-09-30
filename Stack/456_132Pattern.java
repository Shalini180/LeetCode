class Solution {
    public class Pair{
        int value;
        int mini;
        public Pair(int value, int mini){
            this.value = value;
            this.mini = mini;
        }
    };
    public boolean find132pattern(int[] nums) {
        Stack<Pair> st = new Stack<>();
        int currMin = nums[0];
        for(int i = 1;i<nums.length;i++){
            //Find j
            while(!st.isEmpty() && st.peek().value <= nums[i])
            st.pop();

            //if j present, check if kth element is gretaer than i
            if(!st.isEmpty() && st.peek().mini < nums[i])
            return true;

            st.add(new Pair(nums[i], currMin));
            currMin = Math.min(currMin, nums[i]);
        }

        return false;
    }
}
