class Solution {
    public int[][] merge(int[][] intervals) {
     Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
       List<int []>result=new ArrayList<>();
       int start=intervals[0][0];
       int end= intervals[0][1];
       for(int i=1;i<intervals.length;i++){
        int startCurrent=intervals[i][0];
        int endCurrent =intervals[i][1];
        if(startCurrent<=end){
            end=Math.max(end,endCurrent);
        }
        else{
            result.add(new int []{start,end});
            start=startCurrent;
            end=endCurrent;
        }
       } 
         result.add(new int []{start,end});
         return result.toArray(new int [result.size()][]);

        
    }
}