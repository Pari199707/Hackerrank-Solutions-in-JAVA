public static String appendAndDelete(String s, String t, int k) {
    if (k >= (s.length() + t.length())) return "Yes";
    int i;
    int loopLimit = Math.min(s.length(),t.length());
    for (i = 0; i < loopLimit; i++)
    {
        if (s.charAt(i) != t.charAt(i))
            break;
    }
    int minK = (s.length() - i) + (t.length() - i);
    if (minK > k) return "No";
    if ((k - minK) % 2 == 0) return "Yes";
    return "No";

}
