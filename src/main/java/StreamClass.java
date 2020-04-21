import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamClass {
    public void example1(){
        List<String> objects = Arrays.asList("car","book","phone");
        List<String> result = objects.stream().filter(object->!"phone".equals(object)).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
    public void example2(){
        List<Person> personList =Arrays.asList(
                new Person("Burcak",25),
                new Person("Ali",19),
                new Person("Ayse",30)
        );
        Person result = personList.stream()
                .filter((person) -> "Burcak".equals(person.getName()) && 25 == person.getAge())
                .findAny()
                .orElse(null);
        System.out.println(result);
    }
}
