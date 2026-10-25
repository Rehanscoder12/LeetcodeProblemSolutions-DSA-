class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans =new ArrayList<>();
        int top=0;
        int botton=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;

        while(top<=botton && left<=right){
            
            // left to right
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
                
            }
            top++;

            // top to button
            for(int i=top;i<=botton;i++){
                ans.add(matrix[i][right]);
            }
            right--;
            // right to left
            if(top<=botton){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[botton][i]);
                }
                botton--;
            }
            // botton to top
            if(left<=right){
                for(int i=botton;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
        
    }
}