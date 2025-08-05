package lamda.lamda1;

import lamda.Procedure;

public class LambdaSimple2 {
    public static void main(String[] args) {
        Procedure procedure = () -> {
            System.out.println("hello lambda");
        };
        procedure.run();

        Procedure procedure2 = () -> {
            System.out.println("hello lambda");
        };
    }
}
