public class Task6 {
    public static int countVowels(String s) {

        String vowels = "aeiouAEIOU";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "documentation";
        int vowelCount = countVowels(input);
        System.out.println("The number of vowels in '" + input + "' is " + vowelCount + ".");
    }
}
