public static List<Integer> stones(int n, int a, int b) {
    if (a ==b) return Arrays.asList((n-1)*a);
    List<Integer> results = new ArrayList<>();
    int min = Math.min(a, b);
    int max = Math.max(a, b);
    for(int i=0;i<n;i++) {
        results.add(i*max + (n-1-i)*min);
    }
    return results;
}
