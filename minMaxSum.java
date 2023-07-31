public static void miniMaxSum(List<Integer> arr) {
    int mini=Integer.MAX_VALUE;
    int maxi=0;
    long sum=0;
    int n=arr.size();
    for(int i=0;i<5;i++){ 
         if(arr.get(i)>maxi) maxi=arr.get(i);
	 if(arr.get(i)<mini) mini=arr.get(i);
         sum+=arr.get(i);        
    }
    long maxSum=sum-mini;
    long minSum=sum-maxi;
    System.out.print(minSum);
    System.out.print("\t");
    System.out.print(maxSum);
}

