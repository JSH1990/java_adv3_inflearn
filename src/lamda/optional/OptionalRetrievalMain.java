package lamda.optional;

import java.util.Optional;

public class OptionalRetrievalMain {
    public static void main(String[] args) {
        //예제 : 문자열 "JAVA" 가 있는 Optional과 비어있는 Optional 준비
        Optional<String> optValue = Optional.of("Hello");
        Optional<Object> optEmpty = Optional.empty();

        // isPresent() : 값이 있으면 true
        System.out.println("optValue.isPresent() = " + optValue.isPresent());
        System.out.println("optEmpty.isPresent() = " + optEmpty.isPresent());
        System.out.println("optEmpty.isEmpty() = " + optEmpty.isEmpty());

        // get() : 값을 직접꺼냄
        String getValue = optValue.get();
        System.out.println("getValue = " + getValue);

        //값이 있으면 그 값, 없으면 지정된 기본값 사용
        String value1 = optValue.orElse("기본값");
        Object empty1 = optEmpty.orElse("기본값");
        System.out.println("value1 = " + value1);
        System.out.println("empty1 = " + empty1);
        
        //값이 없을때만 람다가 실행되어 기본값 생성
        String value2 = optValue.orElseGet(() -> {
            System.out.println("람다 호출");
            return "New Value";
        });

        Object empty2 = optEmpty.orElseGet(() -> {
            System.out.println("람다호출 empty");
            return "New vlaue";
        });

        System.out.println("value2 = " + value2);
        System.out.println("empty2 = " + empty2);

        //값이 있으면 반환, 없으면 예외 발생
        String value3 = optValue.orElseThrow(() -> new RuntimeException("값이 없습니다."));
        System.out.println("value3 = " + value3);


        try {
            Object empty3 = optEmpty.orElseThrow(() -> new RuntimeException("값이 없습니다."));
            System.out.println("empty3 = " + empty3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Optional을 반환
        Optional<String> result1 = optValue.or(() -> Optional.of("Fallback"));
        System.out.println("result1 = " + result1);
        Optional<Object> result2 = optEmpty.or(() -> Optional.of("Fallback"));
        System.out.println("result2 = " + result2);
    }
}
