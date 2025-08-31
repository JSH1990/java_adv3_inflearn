package lamda.methodRef;

import lamda.methodRef.start.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodRef4 {
    public static void main(String[] args) {
        List<Person> personList = List.of(new Person("Kim"), new Person("Park"), new Person("Lee"));
        List<String> result1 = mapPersonToString(personList, (Person p) -> p.introduce());
        System.out.println("result1 = " + result1);

        List<String> result2 = mapPersonToString(personList, Person::introduce);

    }

    static List<String> mapPersonToString(List<Person> personList, Function<Person, String> fun){
        ArrayList<String> result = new ArrayList<>();
        for (Person p : personList) {
            String applied = fun.apply(p);
            result.add(applied);
        }
        return result;
    }
}
