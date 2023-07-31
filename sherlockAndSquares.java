public static int squares(int a, int b) {
    int start = (int)Math.sqrt(a);
    int end = (int)Math.sqrt(b);
    int count = 0;
    for(int i=start;i<=end;i++){
        if(i*i >= a && i*i<=b){
            count++;
        }
    }
    return count;
 }
