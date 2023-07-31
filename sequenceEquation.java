public static List<Integer> permutationEquation(List<Integer> p) {
    List<Integer> output = new ArrayList<>();
        for (int i = 1; i <= p.size(); i++) {
            output.add(p.indexOf(p.indexOf(i)+1)+1);
        }
    return output;
}
