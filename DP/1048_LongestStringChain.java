class Solution {
    public boolean compare(String a, String b){
        if(a.length() != b.length() + 1)
        return false;

        int i = 0;
        int j = 0;
        while(i < a.length()) {
            if(j < b.length() && a.charAt(i) == b.charAt(j)){
                i++;
                j++;
            }
            else
            i++;
        }
        if(i == a.length() && j == b.length())
        return true;

        return false;
    }
    public int longestStrChain(String[] words) {
        int n = words.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, 1);

        Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));

        int maxi = 1;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<i;j++){
                if(compare(words[i], words[j])){
                    dp[i] = Math.max(dp[i], 1+dp[j]);
                    maxi = Math.max(maxi, dp[i]);
                }
            }
        }

        return maxi;

    }
}
