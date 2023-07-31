public static int equalizeArray(List<Integer> arr) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer v : arr) {
            map.put(v, map.getOrDefault(v, 0) + 1);
            if (map.get(v) > max)
                max = map.get(v);
        }
        return arr.size() - max;
}
