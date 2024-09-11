import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Task9 {
    public static char firstChar(String s){
        Map<Character, Integer> input=new HashMap<>();
        for (char c : s.toCharArray()) {
            input.put(c, input.getOrDefault(c, 0) + 1);
        }
        for (char c : s.toCharArray()) {
            if (input.get(c) == 1) {
                return c;
            }
        }
            return '\0';
    }
    public static void main(String[] args) {
        String input = "abracadabra";
        char result = firstChar(input);
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("There is no non-repeating character.");

        }

    }
}
