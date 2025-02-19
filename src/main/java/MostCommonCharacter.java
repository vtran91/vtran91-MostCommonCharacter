
public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        char most = ' ';
        char[] charArray = str.toCharArray();
        int count = 0;

        for (int i = 0; i < charArray.length; i++) {
            int tempCount = 0;

            for (int j = 0; j < charArray.length; j++)
            {
                if (charArray[i] == charArray[j]) {
                    tempCount++;
                }
                if (tempCount > count) {
                    count = tempCount;
                    most = charArray[i];
                }
            }
        }

        return most;
    }
}
