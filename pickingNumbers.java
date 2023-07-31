public static int pickingNumbers(List<Integer> a) {
        Collections.sort(a);
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<a.size();i++){
            for(int j=i+1;j<a.size();j++){
                if(Math.abs(a.get(i)-a.get(j))<=1){
                    count++;
                }
            }
        max=Math.max(max,count);
        count=0;
        }
     return max+1;
}
