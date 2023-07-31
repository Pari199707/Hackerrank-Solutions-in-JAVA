public static int pageCount(int n, int p) {
    int count = n / 2 + 1;
    int numberOfPage = p / 2 + 1;
    return count - numberOfPage > numberOfPage - 1 ? numberOfPage - 1 : count - numberOfPage;
}
