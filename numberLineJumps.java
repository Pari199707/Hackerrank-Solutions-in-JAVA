public static String kangaroo(int x1, int v1, int x2, int v2) {
    
     if(x1>x2){
        return "NO";
    }
    if(v2>v1){
        return "NO";
    }
    int s1 = x1+v1;
    int s2 = x2+v2;
    if(s1==s2){
        return "YES";
    }
    while(s1<=s2){
        s1 = s1+v1;
        s2 = s2+v2;
        if(s1==s2){
        return "YES";
        }
    }
    return "NO";
}
    
