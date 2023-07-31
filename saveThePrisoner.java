public static int saveThePrisoner(int n, int m, int s) {
    int save=(m%n)+s-1;
    if(save% n == 0)
     return  n ;
     else 
      return save % n;
  }
