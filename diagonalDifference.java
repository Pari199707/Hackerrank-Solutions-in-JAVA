public static int diagonalDifference(List<List<Integer>> arr) {
   int leftSum = 0,rightSum=0;
    for(int i = 0;i<arr.size();++i){
        leftSum+=(arr.get(i)).get(i);
        rightSum+=(arr.get(i)).get(arr.size()-1-i);
    }
    return Math.abs(leftSum-rightSum);
}
