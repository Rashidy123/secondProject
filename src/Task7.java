public class Task7 {
    public static int countWord(String str) {
        int wordCount = 1;
        int len = str.length();
        for (int i = 0; i < len - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i+1) != ' ') {
                wordCount++;
            }
        }
            return wordCount;
        }

    public static void main(String[] args) {
        String str="Hello, world!";
        System.out.println(countWord(str));

    }

}
