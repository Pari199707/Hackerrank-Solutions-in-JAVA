public static String angryProfessor(int k, List<Integer> a) {
    int student=0;
    for(int i=0;i<a.size();i++){
        if(a.get(i)<=0){
            student++;
        }
    }
    if(k>student){
        return "YES";
    }
    return "NO";
}
