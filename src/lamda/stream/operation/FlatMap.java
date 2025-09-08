package lamda.stream.operation;

import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        List<List<Integer>> outList = List.of(List.of(1, 2), List.of(3, 4));

        List<Integer> list1 = outList.stream()
                .flatMap(list -> list.stream())
                .toList();

        System.out.println("list1 = " + list1);
    }
}
