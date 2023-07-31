public static int birthday(List<Integer> s, int d, int m) {
       int n=0;
        for(int i=0;i<s.size();i++)
        {
            int sum=0;
            for (int j=i;(j<=i+m-1)&(i+m-1<s.size());j++)
            {
                sum=sum+s.get(j);
            }
            if(sum==d)
                n++;
        }
        return n;
}
