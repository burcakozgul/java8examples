import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"B","C","A","H","D"};
        List name = Arrays.asList(array);
        name.stream().forEach(n -> System.out.println(n));
        System.out.println("----------------------------");
        name.stream().sorted().forEach(n->System.out.println(n));
        System.out.println("----------------------------");
        name.stream().sorted(Comparator.reverseOrder()).forEach(n->System.out.println(n));
        System.out.println("----------------------------");

        Map<String,String> map2 = new HashMap<>();
        map2.put("B","Burcak");
        map2.put("C","Cem");
        map2.put("A","Ahmet");
        map2.forEach((k, v) -> System.out.println("key : "+k+" value : "+v));
        System.out.println("----------------------------");

        List<Integer> number = Arrays.asList(8,6,4,9,2,1,0,3);
        number.stream().filter(n-> n%2 ==0).forEach(n->System.out.println(n));

        System.out.println("----------------------------");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        //1. Map entries
        Consumer<Map.Entry<String, Integer>> action = System.out::println;
        map.entrySet().forEach(action);
        //2. Map keys
        Consumer<String> actionOnKeys = System.out::println;
        map.keySet().forEach(actionOnKeys);
        //3. Map values
        Consumer<Integer> actionOnValues = System.out::println;
        map.values().forEach(actionOnValues);


    }
}
