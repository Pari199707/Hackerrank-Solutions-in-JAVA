public static long aVeryBigSum(List<Long> ar) {
    long sum=0;
    int n=ar.size();
    for(int i=0;i<n;i++){
        sum+=ar.get(i);
    }
    return sum;
 }
