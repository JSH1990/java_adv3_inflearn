package lamda.lambda3;

import java.util.function.Function;

public class TargetType2 {
    public static void main(String[] args) {
        Function<String, String> upperCase = s -> s.toUpperCase();
        String result1 = upperCase.apply("hello");
        System.out.println("result1 = " + result1);


    }
}
