public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        Collections.rotate(a, k);
        List<Integer> result = new ArrayList<>();
        for (Integer index : queries) {
            result.add(a.get(index));
        }
        return result;
 }
