package lamda.stream.operation;

import java.util.Optional;

public class OptionalSimpleMain {
    public static void main(String[] args) {
        {
            Optional<Integer> o = Optional.of(10);
            System.out.println("o = " + o);
            if (o.isPresent()) {
                Integer i = o.get();
                System.out.println("i = " + i);
            }

            Optional<Object> optional2 = Optional.ofNullable(null);
            System.out.println("optional2 = " + optional2);
            if (optional2.isPresent()) {
                Object o1 = optional2.get();
                System.out.println("o1 = " + o1);
            }
        }
    }
}
