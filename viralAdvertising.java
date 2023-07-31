public static int viralAdvertising(int n) {
    int start=5, cumulative=0,shared=0,liked=0;
        for(int i=0;i<n;i++){
        liked=Math.floorDiv(start, 2);
        shared=liked*3;
        cumulative+=liked;
        start=shared;    
        }
    return cumulative;
}
