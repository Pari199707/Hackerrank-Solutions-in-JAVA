public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
    ArrayList<Integer> res=new ArrayList<>();
     for (Integer ele: arr) {
            brr.remove(ele);
        }
        Set<Integer> set = new HashSet<>(brr);
        List<Integer> result = new ArrayList<>(set);
        Collections.sort(result);
        return result;
}
