package lamda.ex2;

public class BuildGreeterExample {
    public static StringFunction buildGreeter(String greeting){
        return name -> greeting + ", " + name;
    }

    public static void main(String[] args) {
        StringFunction helloGreeter = buildGreeter("Hello");
        StringFunction hiGreeter = buildGreeter("Hi");

        System.out.println("hiGreeter.apply(\"Java\") = " + hiGreeter.apply("Java"));
    }
}
