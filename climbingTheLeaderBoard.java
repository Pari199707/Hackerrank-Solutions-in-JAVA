public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
    List<Integer> scores= new ArrayList<>(player.size());
        ranked= ranked.stream().distinct().sorted().collect(toList());
        for (Integer p : player) {
            int index = Collections.binarySearch(ranked, p);
            if(index<0){
                index+=ranked.size()+2;
            }
            else{
                index= ranked.size()+1 + (-1)*(index+1);
            }
            scores.add(index);
        }
        return scores;
}

