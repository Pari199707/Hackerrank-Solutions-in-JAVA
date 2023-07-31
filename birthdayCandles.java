public static int birthdayCakeCandles(List<Integer> candles) {
    int n=candles.size();
    int  maxi = 0,count=0;
    for(int i=0;i<n;i++){
       if (maxi<candles.get(i)) maxi=candles.get(i);
     
    }
    for(int i=0;i<n;i++){
        if(candles.get(i)==maxi){
            count+=1;
        }
    }
    return count;
}
