class Solution {
    public String longestPalindrome(String s) {
        String prev="";
        for(int i=0;i<s.length();i++){
            // odd length
            String current1=expend(s,i,i);
            //even length
            String current2=expend(s,i,i+1);

            if(current1.length()>prev.length()){
                prev=current1;
            }
            if(current2.length()>prev.length()){
                prev=current2;
            }
        

        }
         return prev;
       
    }
    public String expend(String s,int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
}