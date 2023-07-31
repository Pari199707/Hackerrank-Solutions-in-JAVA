public static int maximumToys(List<Integer> prices, int k) {
    Collections.sort(prices);
    int sum=0;
    int count=0;
    for(int i=0;i<prices.size();i++){
        if(sum+prices.get(i)<=k){
            sum+=prices.get(i);
            count++;
        }
    }
    return count;
}
