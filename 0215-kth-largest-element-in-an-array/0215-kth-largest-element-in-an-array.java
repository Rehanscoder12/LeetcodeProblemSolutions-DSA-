class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer>ans=new PriorityQueue<>();
        for(Integer element : nums){
            ans.offer(element);
            if(ans.size() > k){
                ans.poll();
            }
        }
      
       return ans.poll(); 
        
    }
}