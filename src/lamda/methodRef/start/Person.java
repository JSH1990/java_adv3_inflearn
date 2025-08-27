package lamda.methodRef.start;

public class Person {
    private String name;

    public Person(){
        this("Unknown");
    }

    public Person(String name) {
        this.name = name;
    }

    //정적 메소드
    public static String greeting(){
        return "Hello";
    }

    public static String greetingWithName(String name){
        return "Hello" + name;
    }

    public String getName() {
        return name;
    }

    public String introduce(){
        return "I am" + name;
    }

    public String introduce(int number){
        return "I am" + name + "My Number is " + number;
    }
}
