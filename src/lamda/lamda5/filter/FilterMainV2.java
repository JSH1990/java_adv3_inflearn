package lamda.lamda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterMainV2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        Predicate<Integer> even = n -> n % 2 == 0;
        List<Integer> result = filter(numbers, even);
        System.out.println("result = " + result);
    }

    private static List<Integer> filter(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer number : numbers) {
            if(predicate.test(number)){
                filtered.add(number);
            }
        }
        return filtered;
    }
    }
