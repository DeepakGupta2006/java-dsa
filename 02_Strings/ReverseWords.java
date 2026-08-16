package strings;

/**
 * Problem: Reverse Words in a String
 * Given a string, reverse the order of the words (words separated by spaces),
 * trimming extra spaces.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class ReverseWords {

    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ReverseWords solution = new ReverseWords();
        System.out.println(solution.reverseWords("  the sky   is blue  "));
    }
}
