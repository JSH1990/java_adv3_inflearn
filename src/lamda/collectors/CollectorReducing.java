package lamda.collectors;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorReducing {
    public static void main(String[] args) {
        List<String> names = List.of("a", "b", "c", "d");
        //컬렉션의 리듀싱은 주로 다운 스트림에 활용
        String joined1 = names.stream()
                .collect(Collectors.reducing(
                        (s1, s2) -> s1 + ", " + s2
                )).get();
        System.out.println("joined1 = " + joined1);

        String joined2 = names.stream()
                .reduce((s1, s2) -> s1 + ", " + s2).get();
        System.out.println("joined2 = " + joined2);

        //문자열 전용기능
        String joined3 = names.stream()
                .collect(Collectors.joining(","));
        System.out.println("joined3 = " + joined3);
    }
}
