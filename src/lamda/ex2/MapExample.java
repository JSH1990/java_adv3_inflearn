package lamda.ex2;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
    public static List<String> map(List<String> list, StringFunction func){
        List<String> result = new ArrayList<>();
        for (String str : list) {
            result.add(func.apply(str));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> words = List.of("hello", "java", "lambda");

        List<String> upperList = map(words, s -> s.toUpperCase());
        List<String> decoratedList = map(words, s -> "****" + s + "****");

        System.out.println("upperList = " + upperList);
        System.out.println("decoratedList = " + decoratedList);

    }
}
