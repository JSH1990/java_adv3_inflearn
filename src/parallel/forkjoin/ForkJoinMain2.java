package parallel.forkjoin;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

import static util.MyLogger.log;

public class ForkJoinMain2 {
    public static void main(String[] args) {
        int processors = Runtime.getRuntime().availableProcessors();
        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        System.out.println("processors = " + processors);
        System.out.println("commonPool.getParallelism() = " + commonPool.getParallelism());

        List<Integer> data = IntStream.rangeClosed(1, 8)
                .boxed()
                .toList();
        log("[생성] " + data);

        //ForkJoinPool 생성 및 작업 수행
        SumTask task = new SumTask(data); //[1 ~8]
        Integer result = task.invoke();//공용풀 사용
        System.out.println("result = " + result);
    }
}
