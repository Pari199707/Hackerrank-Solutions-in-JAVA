public static int minimumDistances(List<Integer> a) {
    HashMap<Integer,Integer> mp=new HashMap<>();
    int min_dist = 1000;
    for(int i = 0; i < a.size(); i++){
        if(mp.containsKey(a.get(i))){
            min_dist = Math.min(min_dist, i + 1 - mp.get(a.get(i)));
        }
        mp.put(a.get(i),i+1);
    }
    return (min_dist == 1000) ? -1:min_dist;
}
