public static int countingValleys(int steps, String path) {
    int sum=0;
    int count=0;
    boolean seaLevel=false;
    for(int i=0;i<path.length();i++){
        if(sum==0){
            seaLevel=true;
        }
       sum=path.charAt(i)=='U'? sum+1:sum-1;
       if(seaLevel && sum<0){
           seaLevel=false;
           count++;
       }
    }
    return count;
}
