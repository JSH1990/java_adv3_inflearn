package lamda.ex2;

import java.util.ArrayList;
import java.util.List;

public class FilterExample {
    public static List<Integer> filter(List<Integer> list, MyPredicate predicate){
        ArrayList<Integer> result = new ArrayList<>();
        for (int val : list) {
            if(predicate.test(val)){
                result.add(val);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(-3, -2, -1, 1, 2, 3, 5);

        List<Integer> negatives = filter(numbers, value -> value < 0);
        System.out.println("음수만: " + negatives);

        List<Integer> evens = filter(numbers, value -> value % 2 == 0);
        System.out.println("짝수만: " + evens);
    }
}
