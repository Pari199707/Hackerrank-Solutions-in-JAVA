public static int chocolateFeast(int n, int c, int m) {
    int bars = n/c;
    int wrappers = bars;
    while (wrappers >= m){
        wrappers -= m;
        bars += 1;
        wrappers += 1;
    }
    return bars;
}
    
