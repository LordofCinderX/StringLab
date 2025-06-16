import java.util.Scanner;

public class StringLab {
    public static void main(String[] args) {
        
        // Task 1: Working with String Methods
        
        String str = " Welcome to the Java String Lab! ";

        System.out.println("Length: " + str.length());

         System.out.println("Character at index 7: " + str.charAt(7));

        int javaStart = str.indexOf("Java");
        int javaEnd = javaStart + "Java".length();
        System.out.println("Substring \"Java\": " + str.substring(javaStart, javaEnd));

        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        System.out.println("Index of \"Java\": " + javaStart);

        System.out.println("Contains \"Lab\"? " + str.contains("Lab"));

        String replaced = str.replace("Java", "Java Programming");
        System.out.println("Replaced String: " + replaced);

        String[] words = str.trim().split("\\s+");
        System.out.println("Words after split:");
        for (String word : words) {
            System.out.println(word);
        }

         System.out.println("Trimmed string: \"" + str.trim() + "\"");

        String compareStr = "java string lab!";
        System.out.println("equals: " + compareStr.equals(str.trim()));
        System.out.println("equalsIgnoreCase: " + compareStr.equalsIgnoreCase(str.trim()));

        // Task 2: Loop Challenges with Strings

        int vowelCount = 0;
        String lowerStr = str.toLowerCase();
        for (int i = 0; i < lowerStr.length(); i++) {
            char c = lowerStr.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels in string: " + vowelCount);

        String word = "racecar";
        int left = 0;
        int right = word.length() - 1;
        boolean palindrome = true;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                palindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("Is \"" + word + "\" a palindrome? " + palindrome);

        Scanner scanner = new Scanner(System.in);
        String userSentence;
        do {
            System.out.print("Enter a sentence containing the word \"Java\": ");
            userSentence = scanner.nextLine();
        } while (!userSentence.contains("Java"));
        System.out.println("Thank you!");

        // Task 3: Working with StringBuilder
        
        StringBuilder sb = new StringBuilder("StringBuilder Lab");

        sb.append(" - Learning Java");

        int labIndex = sb.indexOf("Lab") + "Lab".length();
        sb.insert(labIndex, " is fun");

        int learnIndex = sb.indexOf("Learning");
        if (learnIndex != -1) {
            sb.delete(learnIndex, learnIndex + "Learning".length());
        }

        System.out.println("StringBuilder content: " + sb.toString());

        sb.reverse();
        System.out.println("Reversed StringBuilder: " + sb.toString());

        // Task 4: Working with StringBuffer
        
        StringBuffer sbuf = new StringBuffer("Multithreading Lab");

        sbuf.append(" - Learning Java");

        int labIndexBuf = sbuf.indexOf("Lab") + "Lab".length();
        sbuf.insert(labIndexBuf, " is fun");

        int learnIndexBuf = sbuf.indexOf("Learning");
        if (learnIndexBuf != -1) {
            sbuf.delete(learnIndexBuf, learnIndexBuf + "Learning".length());
        }

        System.out.println("StringBuffer content: " + sbuf.toString());

        sbuf.reverse();
        System.out.println("Reversed StringBuffer: " + sbuf.toString());

        scanner.close();
    }
}
