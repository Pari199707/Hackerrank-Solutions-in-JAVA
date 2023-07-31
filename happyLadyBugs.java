    private static final String YES = "YES";
    private static final String NO = "NO";
    private static final char UNDERSCORE = '_';
    private static final int NUMBER_OF_CHARACTERS = 26;
    private static final int INDEX_A = 65;
    
    private static boolean isAlreadyAllLadybugsHappy(String board) {
        if (board.length() == 1) {
            return false;
        }
        for (int i = 1; i < board.length() - 1; i++) {
            if (board.charAt(i) != board.charAt(i - 1) && board.charAt(i) != board.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }


    public static String happyLadybugs(String board) {
    int numberOfEmptyCells = 0;
        int[] characterFrequencies = new int[NUMBER_OF_CHARACTERS];
        /* Determine the frequencies */
        for (char currentCharacter : board.toCharArray()) {
            if (currentCharacter == UNDERSCORE) { // cell is empty
                numberOfEmptyCells++;
            } else { // cell contains a ladybug
                int characterIndex = currentCharacter - INDEX_A;
                characterFrequencies[characterIndex]++;
            }
        }
        /* If there is only a single colored ladybug, there is no chance made all ladybugs happy */
        for (int frequency : characterFrequencies) {
            if (frequency == 1) {
                return NO;
            }
        }
        /* If there board consists of ladybugs all of them are happy */
        if (isAlreadyAllLadybugsHappy(board)) {
            return YES;
        }
        /* If there is no chance to make all ladybugs happy */
        if (numberOfEmptyCells == 0) {
            return NO;
        }
        return YES; // all ladybugs can be made happy
    }
