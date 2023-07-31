private static int numberofA(String s, long rem){
    int count=0;
    for(int i=0;i<rem;i++){
        if(s.charAt(i)=='a')
            count++;
    }
    return count;
}

public static long repeatedString(String s, long n) {
    int a_count=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='a')
            a_count++;
    }
    long rem=n%s.length();
    if(rem==0){
        return (n/s.length())*a_count;
    }
    int count=numberofA(s, rem);
    return ((n/s.length())*a_count)+count;
}
