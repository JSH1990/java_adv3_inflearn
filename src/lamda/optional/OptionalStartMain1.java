package lamda.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalStartMain1 {
    private static final Map<Long, String> map = new HashMap<>();

    static {
        map.put(1L, "Kim");
        map.put(2L, "Seo");
    }

    public static void main(String[] args) {
        findAndPrint(1L); //값이 있는 경우
        findAndPrint(3L); //값이 없는 경우
    }

    //이름이 있으면 이름을 대문자로 출력, 없으면 "UNKNOWN"을 출력해라.
    static void findAndPrint(Long id){
        String name = findNameBy(id).orElse("UNKNOWN");
        System.out.println("name = " + name.toUpperCase());
    }

    static Optional<String> findNameBy(Long id){
        String findName = map.get(id);
        Optional<String> optName = Optional.ofNullable(findName);
        return optName;
    }
}
