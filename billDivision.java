public static void bonAppetit(List<Integer> bill, int k, int b) {
        int max=Integer.MIN_VALUE;
        int rem=0,sum=0,diff=0,half_sum=0,half_k=0;
        for(int i=0;i<bill.size();i++){
            sum+=bill.get(i);
            half_sum=sum/2;
            half_k=bill.get(k)/2;
    
        }
        if (b==half_sum){
               System.out.println(half_k);
            }
        else{
                
                System.out.println("Bon Appetit"); 
            }
    }
