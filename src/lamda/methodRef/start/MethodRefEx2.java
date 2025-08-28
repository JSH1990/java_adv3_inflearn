package lamda.methodRef.start;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefEx2 {
    public static void main(String[] args) {
        Function<String, String> staticMethod1 = name -> Person.greetingWithName(name);

        System.out.println("staticMethod1 = " + staticMethod1.apply("Kim")); //클래스::정적메서드

        Function<String, String> staticMethod2 = Person::greetingWithName;
        System.out.println("staticMethod2 = " + staticMethod2.apply("Kim"));


        //2. 특정 객체의 인스턴스 참조
        Person person = new Person("Kim");

        Supplier<String> instanceMethod2 = person::introduce;
        System.out.println("instanceMethod2 = " + instanceMethod2.get());

        //3. 생성자 참조
        Function<String, Person> newPerson1 = name-> new Person(name);
        System.out.println("newPerson1 = " + newPerson1.apply("Kim"));
        Function<String, Person> newPerson2 = Person::new;
        System.out.println("newPerson2 = " + newPerson2.apply("Kim"));
    }
}
