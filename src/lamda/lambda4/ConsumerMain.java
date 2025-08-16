package lamda.lambda4;

import java.util.function.Consumer;

public class ConsumerMain {
    public static void main(String[] args) {
        Consumer<String> consumer1 = s -> System.out.println("string = " + s);
        consumer1.accept("hello consumer");
    }
}
