public static int migratoryBirds(List<Integer> arr) {
    Map<Integer,Integer> freq=new TreeMap<>();
    int type=-1;
    for(int i=0;i<arr.size();i++){
        if(freq.containsKey(arr.get(i))){
            int val=freq.get(arr.get(i));
            freq.put(arr.get(i),val+1);
        }
        else{
            freq.put(arr.get(i),1);
        }
       
    }
    int maxcount=Integer.MIN_VALUE;
    for(Integer key:freq.keySet()){
        if(freq.get(key)>maxcount){
            maxcount=freq.get(key);
            type=key;
        }
    }
    return type;
}
