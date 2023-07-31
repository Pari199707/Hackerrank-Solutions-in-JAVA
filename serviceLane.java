public static List<Integer> serviceLane(int n, List<List<Integer>> cases,List<Integer> width) {
    List<Integer> results = new ArrayList<>();
        for(List<Integer> l : cases){
            int min = width.get(l.get(0));
            for(int i = l.get(0);i<=l.get(1);i++){
                if(width.get(i)< min)min = width.get(i);
            }
            results.add(min);
        }
        return results;
}
