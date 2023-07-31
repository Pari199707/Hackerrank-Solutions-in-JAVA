 public static int getTotalX(List<Integer> a, List<Integer> b) {
    int count =0;
        for(int i=a.get((a.size()-1));i<=b.get(0);i++)
        {   
            int count1=0;
            for(int x:a)
            {
                if(i%x==0)
                    count1+=1;
            }
            int count2=0;
            for(int y:b)
            {
                if(y%i==0)
                    count2+=1;
            }
            if(count1==a.size() && count2==b.size())
                count+=1;
        }
        return count;
}
