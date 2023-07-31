public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int apples_falling=0 , oranges_falling=0;
        for(int i=0;i<apples.size();i++){
            int d=apples.get(i);
            int pos=a+d;
            if(pos>=+s && pos<=t){
                apples_falling+=1;
            }
        }
        for(int i=0;i<oranges.size();i++){
            int d=oranges.get(i);
            int pos=b+d;
            if(pos>=+s && pos<=t){
                oranges_falling+=1;
            }
        }
        System.out.println(apples_falling);
        System.out.println(oranges_falling);
        

    }
