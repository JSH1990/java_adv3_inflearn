package lamda.lamda5.map;

import java.util.List;

public class MapMainV5 {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "orange");
        List<String> upper = GenericMapper.map(fruits, s -> s.toUpperCase());
        System.out.println("upper = " + upper);
    }
}
