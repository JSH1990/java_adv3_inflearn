package funtional;

import java.util.ArrayList;
import java.util.List;

public class DeclarativeMain {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //명령형 : for 문과 조건 검사로 처리
        ArrayList<Object> result1 = new ArrayList<>();
        for (Integer number : numbers) {
            if(number % 2 == 0){
                result1.add(number * number);
            }
        }
        System.out.println("Imperative : " + result1);

        //선언형 : 스트림 api 로 처리
        List<Integer> result2 = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .toList();
        System.out.println(result2 + "선언형");
    }
}
