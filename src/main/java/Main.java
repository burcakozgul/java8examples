import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ForeachClass foreachClass = new ForeachClass();
        foreachClass.example1();
        System.out.println("----------------------------");
        foreachClass.example2();
        System.out.println("----------------------------");
        foreachClass.example3();
        System.out.println("----------------------------");
        foreachClass.example4();
        System.out.println("----------------------------");
        StreamClass streamClass = new StreamClass();
        streamClass.example1();
        System.out.println("----------------------------");
        streamClass.example2();

    }
}
