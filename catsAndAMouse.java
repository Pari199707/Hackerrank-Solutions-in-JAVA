static String catAndMouse(int x, int y, int z) {
        int  AC=Math.abs(z-x);
        int  BC=Math.abs(z-y);
        if (AC==BC){
            return "Mouse C";
        }
        else if (AC > BC){
            return "Cat B";
        }
        else{
            return "Cat A";
        }
}
