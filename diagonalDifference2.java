public static int diagonalDifference(List<List<Integer>> arr) {
   int leftSum = 0,rightSum=0 , n=arr.size();
   int row=0,col=0;
   while(row<n){
       leftSum+=arr.get(row).get(col);
       row++;col++;
   }
   row=0;col=n-1;
   while(row<n){
       rightSum+=arr.get(row).get(col);
       row++;col--;
   }
   int diff=Math.abs(leftSum-rightSum);
   return diff;
}
