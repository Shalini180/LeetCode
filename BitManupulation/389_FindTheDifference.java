class Solution {
    public char findTheDifference(String s, String t) {
        int c = 0;
        for(int i = 0;i<s.length();i++)
        c += t.charAt(i) - s.charAt(i);

        c+= t.charAt(s.length());
        return (char)c;

    }
}
