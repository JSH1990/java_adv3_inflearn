package lamda.lamda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

//static factory 추가
public class MyStreamV3<T> {
    private List<T> interalList;

    private MyStreamV3(List<T> interalList) {
        this.interalList = interalList;
    }

    public static <T> MyStreamV3<T> of(List interalList){
        return new MyStreamV3(interalList);
    }

    public MyStreamV3<T> filter(Predicate<T> predicate){
        List<T> filtered = new ArrayList<>();
        for (T element : interalList) {
            if(predicate.test(element)){
                filtered.add(element);
            }
        }
        return MyStreamV3.of(filtered);
    }

    public <R> MyStreamV3<R> map(Function<T, R> mapper){
        List<R> mapped = new ArrayList<>();
        for (T element : interalList) {
            mapped.add(mapper.apply(element));
        }
        return new MyStreamV3(mapped);
    }

    public List<T> toList(){
        return interalList;
    }

    public void forEach(Consumer<T> consumer){
        for (T element : interalList) {
            consumer.accept(element);
        }
    }
}
