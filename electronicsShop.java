static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int spend=0,maxspend=-1;
        for(int i=0;i<keyboards.length;i++){
            for(int j=0;j<drives.length;j++){
                if (keyboards[i]+drives[j]<=b){
                    spend=keyboards[i]+drives[j];
                    maxspend=Math.max(maxspend,spend);
                }
            }
        }
        return maxspend;
}
