public static void extraLongFactorials(int n) {
    BigInteger result = BigInteger.ONE;
        for(int i=n;i>0;i--){
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result); 
}
