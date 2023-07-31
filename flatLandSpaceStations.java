static int flatlandSpaceStations(int n, int[] c) {
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = Integer.MAX_VALUE;
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < c.length; j++) {
                int v = c[j];
                d[i] = Math.min(Math.abs(v - i), d[i]);
            }
            max = Math.max(d[i], max);
        }
        return max;
}

   
