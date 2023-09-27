class Solution {
    public String decodeAtIndex(String s, int k) {
       //Might lead to an overflow if int is given.
       long size = 0;
       //Calculate the size
       for(int i = 0;i<s.length();i++){
           char a = s.charAt(i);
           if(Character.isDigit(a))
           size = size * Integer.parseInt("" + a);
           else
           size+=1;
       }

       for(int i = s.length()-1;i>=0;i--){
           k %= size;
           char a = s.charAt(i);

           if(k == 0  && Character.isDigit(a) ==false)
           return "" + a;
          
           if(Character.isDigit(a))
           size = size/Integer.parseInt("" + a);
           else
           size -= 1;
       }

       return "";
    }
}
