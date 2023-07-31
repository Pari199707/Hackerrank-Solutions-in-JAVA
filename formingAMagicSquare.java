public static int formingMagicSquare(List<List<Integer>> s) {
        final List<List<Integer>> magicSquares = Arrays.asList(
                Arrays.asList(6, 1, 8, 7, 5, 3, 2, 9, 4),
                Arrays.asList(8, 1, 6, 3, 5, 7, 4, 9, 2),
                Arrays.asList(6, 7, 2, 1, 5, 9, 8, 3, 4),
                Arrays.asList(8, 3, 4, 1, 5, 9, 6, 7, 2),
                Arrays.asList(2, 7, 6, 9, 5, 1, 4, 3, 8),
                Arrays.asList(4, 3, 8, 9, 5, 1, 2, 7, 6),
                Arrays.asList(2, 9, 4, 7, 5, 3, 6, 1, 8),
                Arrays.asList(4, 9, 2, 3, 5, 7, 8, 1, 6)); 
                
        
        
        List<Integer> flatList = s.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        
        int result = magicSquares.stream().map(x -> {

            int sum = 0;
            for (int i = 0; i < x.size(); i++) {
                int listDiff = x.get(i) - flatList.get(i);
                sum += Math.max(listDiff, listDiff * -1);
            }

            return sum;
        }
      ).mapToInt(x -> x).min().getAsInt();
    
    return result;

    }



