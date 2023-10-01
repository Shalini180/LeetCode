class Solution {
    public String reverseWords(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder str = new StringBuilder();
        for(int k =0;k<s.length();k++){
            if(s.charAt(k) == ' ') {
                while(!st.isEmpty()){
                    str.append(st.peek());
                    st.pop();
                }
                str.append(' ');
            }
            else{
                st.add(s.charAt(k));
            }

        }
        
        while(!st.isEmpty()){
            str.append(st.peek());
            st.pop();
        }
        return str.toString();
    }
}
