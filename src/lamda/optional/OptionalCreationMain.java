package lamda.optional;

import java.util.Optional;

public class OptionalCreationMain {
    public static void main(String[] args) {
        //1. of () : 값이 null 이 아님이 확실할때 사용, null 이면 null 예외출력
        String nonNullvalue = "Hello Opitonal!";
        Optional<String> opt1 = Optional.of(nonNullvalue);
        System.out.println("opt1 = " + opt1);

        //2. ofNullable() : 값이 null 일수도 아닐수도 있을때
        Optional<String> opt2 = Optional.ofNullable("hello");
        Optional<Object> opt3 = Optional.ofNullable(null);
        System.out.println("opt2 = " + opt2);
        System.out.println("opt3 = " + opt3);

        //3. empty() : 비어있는 Optional을 명시적으로 생성
        Optional<Object> empty = Optional.empty();
        System.out.println("empty = " + empty);
    }
}
