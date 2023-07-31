public static int beautifulDays(int i, int j, int k) {
    int count=0;
        for(int start=i;start<=j;start++){
            int val=start;
            int sum=0;
            while(val>0){
                int rem=val%10;
                sum=(sum*10)+rem;
                val=val/10;
            }
            int diff=Math.abs(sum-start);
            if(diff%k==0){
                count++;
            }
        }
        return count;
    }
