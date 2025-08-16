package lamda.lambda4;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class BiMain {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) ->a + b;
        System.out.println("add.apply(5, 10) = " + add.apply(5, 10));

        BiConsumer<String, Integer> repeat = (c, n) -> {
            for (int i = 0; i <n ; i++) {
                System.out.printf(c);


            }
            System.out.println();
        };
        repeat.accept("*", 5);
    }
}
