package lamda.stream.operation;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        //기본형 특화 스트림
        IntStream stream = IntStream.of(1, 2, 3, 4, 5);
        stream.forEach(i -> System.out.print(i + " "));
        System.out.println();

        //범위 생성 메서드 (IntStream, LongStream)
        IntStream range1 = IntStream.range(1, 6); //1,2,3,4,5
        IntStream range2 = IntStream.rangeClosed(1, 6);

        range1.forEach(i -> System.out.print(i + " "));

        //sum
        int sum = IntStream.range(1, 6).sum();
        System.out.println("sum = " + sum);

        //average(): 평균값 계산
        double avg = IntStream.range(1, 6)
                .average()
                .getAsDouble();
        System.out.println("avg = " + avg);

        //summaryStatistics() : 모든 통계 정보
        IntSummaryStatistics stats = IntStream.range(1, 6).summaryStatistics();
        System.out.println("합계 :" + stats.getSum());

        //2. 타입 변환 메서드
        //IntStream -> LongStream


        //4. 객체 스트림 -> 기본형 특화 스트림으로 매핑
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        IntStream intStream = integerStream.mapToInt(i -> i);
        System.out.println("intStream = " + intStream);

    }
}
