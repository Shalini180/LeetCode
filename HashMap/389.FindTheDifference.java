class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> mp = new HashMap<>();
        //Add the count of s;
        for(int i = 0;i<s.length();i++){
            int p = mp.getOrDefault(s.charAt(i), 0);
            mp.put(s.charAt(i), p + 1);
        }

        int pos = 0;
        for(int i = 0;i<t.length();i++){
            char c = t.charAt(i);
            if(mp.get(c) == null){
                pos = i;
                break;
            }
            else{
                int p = mp.get(c);
                p = p-1;
                if(p == 0)
                mp.remove(c);
                else
                mp.put(c, p);
            }
        }

        return t.charAt(pos);
    }
}
