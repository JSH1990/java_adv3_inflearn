package lamda.lamda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

//static factory 추가
public class MyStreamV2 {
    private List<Integer> interalList;

    private MyStreamV2(List<Integer> interalList) {
        this.interalList = interalList;
    }

    public static MyStreamV2 of(List<Integer> interalList){
        return new MyStreamV2(interalList);
    }

    public MyStreamV2 filter(Predicate<Integer> predicate){
        List<Integer> filtered = new ArrayList<>();
        for (Integer element : interalList) {
            if(predicate.test(element)){
                filtered.add(element);
            }
        }
        return new MyStreamV2(filtered);
    }

    public MyStreamV2 map(Function<Integer, Integer> mapper){
        List<Integer> mapped = new ArrayList<>();
        for (Integer element : interalList) {
            mapped.add(mapper.apply(element));
        }
        return new MyStreamV2(mapped);
    }

    public List<Integer> toList(){
        return interalList;
    }
}
