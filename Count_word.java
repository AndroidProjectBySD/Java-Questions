package anudip.DSA;
import java.util.Scanner;

public class Count_word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // take input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Count words in the string
        int wordCount = countWords(input);

        // Output
        System.out.println("The number of words in the string is: " + wordCount);
        scanner.close();
    }

    public static int countWords(String str) {
        // Remove leading and trailing space using trim
        str = str.trim();

        // Check for an empty string
        if (str.isEmpty()) {
            return 0;
        }

        String[] words = str.split("\\s+");
        return words.length;
    }
}
