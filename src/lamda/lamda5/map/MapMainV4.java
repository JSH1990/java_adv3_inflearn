package lamda.lamda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapMainV4 {
    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");

        //문자열을 숫자로 변환
        List<Integer> number = StringToIntegerMapper.map(list, s -> Integer.valueOf(s));
        System.out.println("number = " + number);
        //문자열의 길이
        List<Integer> length = StringToIntegerMapper.map(list, s -> s.length());
        System.out.println("length = " + length);
    }
}
