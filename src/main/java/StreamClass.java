import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public void List(){
        List<String> objects = Arrays.asList("car","book","phone");
        List<String> result = objects.stream().filter(object->!"phone".equals(object)).collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
