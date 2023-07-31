public static String balancedSums(List<Integer> arr) {
         int leftSum=0,sum=0;
         for(int i=0;i<arr.size();i++){
             sum+=arr.get(i);
        }
         for(int i=0;i<arr.size();i++){
             sum=sum-arr.get(i);
             if(sum==leftSum)
                return "YES";
             else 
                leftSum+=arr.get(i);
        }
         return "NO";
  }
