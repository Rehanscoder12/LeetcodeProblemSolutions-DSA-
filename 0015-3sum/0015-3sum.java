class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       // we have a+b+c=0;
       //a+b=-c;
       // so now this becomes two sum 
       // 1 sort
       //2 dupicate ----> fixed (a), and duplicate avoid
      
      int n=nums.length;
      Arrays.sort(nums);
      List<List<Integer>> result = new ArrayList<>();
      if(n<3){
        return result;
      }
       for(int i=0;i<n-2;i++){
        if(i>0 && nums[i]==nums[i-1]){
            continue;
        }
        int c=nums[i];
        int target=-c;
        twoSum(nums,target,i+1,n-1,result);

       }
       return result;
        
    }
    private void twoSum(
        int [] nums,
        int target,
        int i,
        int j,
        List<List<Integer>> result
    ){
        while(i<j){
          
            int sum = nums[i] + nums[j];

            if (sum < target) {
                i++;
            } 
            else if (sum > target) {
                j--;
            } 
            else{
                while(i<j && nums[i]==nums[i+1]) i++;
                while(i<j && nums[j]==nums[j-1])j--;
                result.add(Arrays.asList(
                    -target, nums[i], nums[j]
                ));
                i++;
                j--;
            }
        }
    }
   
}