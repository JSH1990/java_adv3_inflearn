package lamda.lamda5.filter;

import java.util.List;
import java.util.function.Predicate;

public class FilterMainV4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        Predicate<Integer> even = n -> n % 2 == 0;
        numbers = IntegerFilter.filter(numbers, even);
        List<Integer> result = numbers;
        System.out.println("result = " + result);
    }

    }
