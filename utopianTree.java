public static int utopianTree(int n) {
    return ((1 << ((n / 2) + 1) ) - 1) << n%2;
}
