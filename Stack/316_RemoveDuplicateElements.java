class Solution {
    public String removeDuplicateLetters(String s) {
       StringBuilder ans = new StringBuilder();
       //Count of Characters
       int[] hash = new int[26];
       Arrays.fill(hash, 0);
       for(int i = 0;i<s.length();i++){
           hash[s.charAt(i) -'a'] += 1;
       }
    
        //Visited Array
        Boolean[] seen = new Boolean[26];
        Arrays.fill(seen, false);
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            int index = s.charAt(i) - 'a';
            if(seen[index] == true){
                hash[index] -=1;
                continue;
            }

            while(st.size() > 0 && st.peek()>s.charAt(i) && hash[st.peek() - 'a'] >0){
                seen[st.peek() - 'a'] = false;
                st.pop();
            }

            st.push(s.charAt(i));
            hash[index] -=1;
            seen[index] = true;
        }

        while(st.size() > 0){
            char p = st.peek();
            ans.append(p);
            st.pop();
        }
        return ans.reverse().toString();

    }
}
