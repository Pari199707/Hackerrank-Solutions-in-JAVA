public static List<Integer> cutTheSticks(List<Integer> arr) {
    Collections.sort(arr);
    ArrayList<Integer>result=new ArrayList<>();
    result.add(arr.size());
    int min=arr.get(0);
    for(int i = 1; i < arr.size(); i++){
        if(arr.get(i) >min){
            min=arr.get(i);
            result.add(arr.size()-i);
        }
    }
    return result;
}
