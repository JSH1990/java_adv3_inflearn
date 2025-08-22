package lamda.lamda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class MyStreamV1 {
    private List<Integer> interalList;

    public MyStreamV1(List<Integer> interalList) {
        this.interalList = interalList;
    }
    
    public MyStreamV1 filter(Predicate<Integer> predicate){
        List<Integer> filtered = new ArrayList<>();
        for (Integer element : interalList) {
            if(predicate.test(element)){
                filtered.add(element);
            }
        }
        return new MyStreamV1(filtered);
    }

    public MyStreamV1 map(Function<Integer, Integer> mapper){
        List<Integer> mapped = new ArrayList<>();
        for (Integer element : interalList) {
            mapped.add(mapper.apply(element));
        }
        return new MyStreamV1(mapped);
    }

    public List<Integer> toList(){
        return interalList;
    }
}
