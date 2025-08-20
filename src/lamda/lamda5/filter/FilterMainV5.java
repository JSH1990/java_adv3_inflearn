package lamda.lamda5.filter;

import java.util.List;

public class FilterMainV5 {
    public static void main(String[] args) {
        //숫자 사용 필터
        List<Integer> numbers = List.of(1, 2, 3, 4);
        List<Integer> numberResult = GenericFilter.filter(numbers, n1 -> n1 % 2 == 0);
        System.out.println("evenNumbers = " + numberResult);

        //문자 사용 필터
        List<String> strings = List.of("A", "BB", "CCC");
        List<String> stringResult = GenericFilter.filter(strings, s -> s.length() >= 2);
        System.out.println("stringResult = " + stringResult);
    }

    }
