class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //int count=0;
        Map<Integer,Integer>mp=new HashMap<>();
        for(int x:nums){
           // count++;
            mp.put(x,mp.getOrDefault(x, 0) + 1);
        }
        Queue<Integer>pq=new PriorityQueue<>(  (a, b) -> mp.get(a) - mp.get(b));
        for(int x:mp.keySet()){
            pq.offer(x);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int ans[]=new int [k];
        for(int i=k-1;i>=0;i--){
            ans[i]=pq.poll();
        }
        
      return ans;  
    }
}