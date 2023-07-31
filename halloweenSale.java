public static int howManyGames(int p, int d, int m, int s) {
    int result = 0;
    while( s >= p){
        s -= p;
        p = Math.max(m, p-d);
        result++;
    }
    return result;
}
