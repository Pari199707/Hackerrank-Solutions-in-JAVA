public static int marsExploration(String s) {
        int result = 0;
        String base = "SOS";
        for(int i = 0; i < s.length(); i++) 
            if(s.charAt(i) != base.charAt(i%3))
                 result++;
    return result;
}
