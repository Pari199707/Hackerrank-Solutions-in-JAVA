public static int designerPdfViewer(List<Integer> h, String word) {
    int width=word.length();
    int height=1;
    for(int i=0;i<word.length();i++){
        int heightOfChar=h.get(word.charAt(i)-'a');
        height=Math.max(height,heightOfChar);
    }
    return width*height;
}
