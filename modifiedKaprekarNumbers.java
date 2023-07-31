public static void kaprekarNumbers(int p, int q) {
     boolean flag = false;
        for (int i = p; i <= q; i++) {
            long square = (long) i * i;
            int r = (int) Math.log10(i) + 1;
            int prefix = (int) (square / (Math.pow(10, r)));
            int suffix = (int) (square % (Math.pow(10, r)));
            if (prefix + suffix == i) {
                flag = true;
                System.out.print(i + " ");
            }
        }
        if (!flag) {
            System.out.println("INVALID RANGE");
        }
}
      
