public static List<Integer> breakingRecords(List<Integer> scores) {
        int min=scores.get(0);
        int max=scores.get(0);
        int count_min=0,count_max=0;
        
        for(int i=0;i<scores.size();i++){
            if (scores.get(i)<min){
                min=scores.get(i);
                count_min++;
            }
            if (scores.get(i)>max){
                max=scores.get(i);
                count_max++;
            }
        }
        ArrayList<Integer> ar=new ArrayList<Integer>();
        ar.add(count_max);
        ar.add(count_min);
        
        return ar;
}
