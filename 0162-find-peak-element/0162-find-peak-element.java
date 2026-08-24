class Solution {
    public int findPeakElement(int[] nums) {
      int first=0;
      int last=nums.length-1;
      while(first<last){
        int mid=first+(last-first)/2;
        if(nums[mid]>nums[mid+1]){
            last= mid;
        }
        else{
            first=mid+1;
        }
     
      }return first; 
    }
}