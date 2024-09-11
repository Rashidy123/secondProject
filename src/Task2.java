public class Task2 {
    public static int countAlphaCharacters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String input="Hello, World! 123";
        int alphaCount = countAlphaCharacters(input);
        System.out.println("Number of alphabetic characters: " + alphaCount);


    }
}
