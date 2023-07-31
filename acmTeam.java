public static List<Integer> acmTeam(List<String> topic) {
    List<Integer>list = new ArrayList<>();
    int maxTopic = 0;
    int maxTeam = 0;
    int countTopic = 0;
    for(int i = 0; i < topic.size()-1; i++) {
        for(int j = i + 1; j < topic.size(); j++) {
            for(int k = 0; k < topic.get(i).length(); k++ ) {
                if(topic.get(i).charAt(k) == '1' || topic.get(j).charAt(k) == '1') {
                    countTopic ++;
                }
            }
            if (maxTopic == countTopic) {
                maxTeam++;   
            } else if (maxTopic < countTopic) {
                maxTopic = countTopic;
                maxTeam = 1;
            }
            countTopic=0;
        }
    }
    list.add(maxTopic);
    list.add(maxTeam);
    return list;
  }
