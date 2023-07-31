public static int beautifulTriplets(int d, List<Integer> arr) {
    int count=0;
    int n=arr.size();
    for (int i=0;i<n;i++){
        if(arr.contains(arr.get(i)+d)&&arr.contains(arr.get(i)+d+d))
                count++;            
    }
    return count;
}
