class Solution {
    
    public int[] dailyTemperatures(int[] nums) {
        Stack<int [] >st=new Stack<>();
        int[] ans=new int[nums.length];
        
     
        for(int i=0;i<nums.length;i++){
         
         while(!st.isEmpty() && nums[i]>st.peek()[0]){
            int index=st.peek()[1];
            int r=i-index;
            ans[index]=r;
            st.pop();
         }
         st.push(new int []{nums[i],i});
         
        
        }


        

         return ans;
    }
}