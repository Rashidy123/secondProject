import java.util.ArrayList;
import java.util.HashSet;

public class Task10 {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<>();
        array.add("Apple");
        array.add("grape");
        array.add("Banana");
        array.add("Apple");
        array.add("Mango");
        System.out.println(array);
        HashSet<String> array1=new HashSet<>(array);
        System.out.println(array1);
    }
}
