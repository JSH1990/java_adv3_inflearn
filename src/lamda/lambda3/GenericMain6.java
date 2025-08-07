 package lamda.lambda3;

public class GenericMain6 {
    public static void main(String[] args) {
        GenericFunction<String, String> toUpperCase = str -> str.toUpperCase();
        GenericFunction<String, Integer> stringLength = str -> str.length();
        GenericFunction<Integer, Integer> square = x -> x * x;
        GenericFunction<Integer, Boolean> isEven = num -> num % 2 == 0;

        System.out.println("toUpperCase.apply(\"test\") = " + toUpperCase.apply("test"));
    }

    @FunctionalInterface
    interface GenericFunction<T, R> {
        R apply(T s);
    }
}
