import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apricot");
        fruits.add("Avocado");
        fruits.add("Cherry");
        fruits.add("Apple");
        fruits.add("Strawberry");
        fruits.add("grape");
        ArrayList<String>str=new ArrayList<>();
        for(String s:fruits){
            if(s.startsWith("A")){
                str.add(s.toLowerCase());
            }
        }
        System.out.println(str);
    }
}
