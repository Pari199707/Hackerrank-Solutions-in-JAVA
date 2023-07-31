public static List<Integer> jimOrders(List<List<Integer>> orders) {
        List<Integer> ans = new ArrayList<>();
        int[][] serveOrder = new int [orders.size()][3];
        for(int i = 0; i < orders.size() ; i++){
            serveOrder[i] = new int[]{ i+1, orders.get(i).get(0), orders.get(i).get(0) + orders.get(i).get(1) };
        }
        Arrays.sort(serveOrder,(a,b)-> a[2] == b[2] ? a[0] - b[0] : a[2] - b[2]);
        for(int[] customer : serveOrder){
            ans.add(customer[0]);
        }
        return ans;
}
