class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int n1=nums1.length;
        int n2=nums2.length;
        Stack<Integer>st=new Stack<>();
        Map<Integer,Integer>mp=new HashMap<>();
        for(int i=n2-1;i>=0;i--){
            int curr=nums2[i];

            while(!st.isEmpty() && st.peek()<=curr){
                st.pop();
            }
            if(st.isEmpty()){
                mp.put(curr,-1);
            }
            else{
                mp.put(curr,st.peek());
            }
            st.push(curr);

        }

        int[] ans=new int[n1];
        for(int i=0;i<n1;i++){
            ans[i]=mp.get(nums1[i]);

        }
     
      return ans;
        
    }
}