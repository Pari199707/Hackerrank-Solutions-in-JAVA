public static void plusMinus(List<Integer> arr) {
     int n_positive=0,n_zero=0,n_negative=0;
    int n=arr.size();
    for (int i=0;i<n;i++){
        if (arr.get(i)>0){
            n_positive+=1;
        }
        else if (arr.get(i)<0){
            n_negative+=1;
        }
        else
            n_zero+=1;
    }
    double d_positive,d_negative,d_zero,d_n=arr.size();
    d_positive=(n_positive/d_n);
    d_negative=(n_negative/d_n);
    d_zero=(n_zero/d_n);
    System.out.println(d_positive);
    System.out.println(d_negative);
    System.out.println(d_zero);
}
