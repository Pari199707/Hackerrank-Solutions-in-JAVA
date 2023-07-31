public static int hurdleRace(int k, List<Integer> height) {
    int max=0;
    int dose=0;
    for(int i=0;i<height.size();i++){
        max=Math.max(height.get(i),max);   
    }
    if(k<max){
    dose=Math.abs(max-k);
    }
    return dose;
}
