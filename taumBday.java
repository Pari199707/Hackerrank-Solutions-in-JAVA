public static long taumBday(int b, int w, int bc, int wc, int z) {
    long bp = Math.min(bc, wc + z);
    long wp = Math.min(wc, bc + z);
    return bp * b + wp * w;
}
