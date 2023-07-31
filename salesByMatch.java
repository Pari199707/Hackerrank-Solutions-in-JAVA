public static int sockMerchant(int n, List<Integer> ar) {
    int count=0;
    Map<Integer,Integer> freq=new HashMap<>();
    for(int i=0;i<n;i++){
        if(freq.containsKey(ar.get(i))){
            int value=freq.get(ar.get(i));
            freq.put(ar.get(i),value+1);
        }else{
            freq.put(ar.get(i),1);
        }
    }
    for(Integer key:freq.keySet()){
        count+=freq.get(key)/2;
        }
        return count;
 }
