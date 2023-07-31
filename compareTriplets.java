public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> triplet_score= new ArrayList<>();
        int alice=0,bob=0;
        for(int i=0;i<3;i++){
            if(a.get(i)>b.get(i)){
                alice++;
            }
            else if(a.get(i)<b.get(i)){
                bob++;
            }
        }  
        triplet_score.add(alice);
        triplet_score.add(bob);
        
        
return triplet_score;

}

