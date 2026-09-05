class Solution {
    public boolean isIsomorphic(String s, String t) {
         boolean match =true;
         for(int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i))!=t.indexOf(t.charAt(i))){
                match=false;
            }
         }
         return match;
          
    }
}