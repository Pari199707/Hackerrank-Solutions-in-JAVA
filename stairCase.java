public static void staircase(int n) {
    int space=n-1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=space;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("#");
        }
        System.out.println(" ");
        space--;
            
    }
 }
