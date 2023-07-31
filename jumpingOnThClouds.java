public static int jumpingOnClouds(List<Integer> c) {
    int jumps = 0;
        for(int i=0;i< c.size();i++){
            if (c.size()==2|| c.size()==3)
                return 1;
            if(c.get(0)==0 && i!=0){
                jumps += 1;
            }
            if(i+2 < c.size()){
                if(c.get(i+2)==0){
                    i=i+1;
                }
            }                   
        }
    return jumps;
 }

