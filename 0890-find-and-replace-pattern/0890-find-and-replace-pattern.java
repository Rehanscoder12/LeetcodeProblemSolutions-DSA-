class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String>ans=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String temp=words[i];
            if(pattern.length()==temp.length()){
                boolean match =true;
                for(int j=0;j<temp.length();j++){
                    if (temp.indexOf(temp.charAt(j)) != pattern.indexOf(pattern.charAt(j))){
                       match=false;
                        break;
                    }
                   
                }
                if(match){
                    ans.add(temp);
                }
            }
        }
        return ans;
    }
}