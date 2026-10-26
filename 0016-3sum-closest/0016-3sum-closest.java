class Solution {
    public int threeSumClosest(int[] nums, int target) {
      Arrays.sort(nums);
      int n=nums.length;
    //   int min=Integer.MAX_VALUE;
    //   int result=0;
    //   //int [] ans=new ans[n];
    //   int k=0;
    //   int i=k+1;
    //   int j=n-1;
    //   for(k=0;k<n-2;k++){
    //     int f=nums[k];
    //     while(i<j){
    //         result=f+nums[i]+nums[j];
    //         if(result==target || result+1==target){
    //             break;
    //         }
    //         else{
    //             i++;
    //             j--;
    //         }

    //     }
    //     i++;
    //     j=n-1;
    //   }


    //  return result;

      int result=nums[0]+nums[1]+nums[2];
      for(int i=0;i<=n-3;i++){
        int j=i+1;
        int k=n-1;

        while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            if(Math.abs(target-sum)<Math.abs(target-result)){
                result=sum;
            }
           if( sum== target) return target;
           else if( sum <target) j++;
           else k--;

        }

      }

     return result;
        
    }
}