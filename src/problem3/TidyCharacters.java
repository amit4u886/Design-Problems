package problem3;

public class TidyCharacters {
    public static String tidy(String s) {
        int[] lettersFrequency = new int[26];
        int digitsSum = 0;
        StringBuilder specialChars = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ('0' <= c && c <= '9') {
                digitsSum += (c - '0');
            } else if ('A' <= c && c <= 'Z') {
                lettersFrequency[c - 'A']++;		//Incrementing Frequency per letter, because one letter will hold a place in integer array
            } else {
                specialChars.append(c);
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < lettersFrequency.length; i++) {
            int count = lettersFrequency[i];
            for (int j = 0; j < count; j++) {
                result.append((char) ('A' + i));
            }
        }
        result.append(digitsSum);
        result.append(specialChars);
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("<< " + args[0]);
        System.out.println(">> " + tidy(args[0]));
    }
}
