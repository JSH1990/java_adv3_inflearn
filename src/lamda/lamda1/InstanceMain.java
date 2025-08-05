package lamda.lamda1;

import lamda.Procedure;

public class InstanceMain {
    public static void main(String[] args) {
        Procedure procedure = new Procedure() {
            @Override
            public void run() {
                System.out.println("hello! lambda");
            }
        };
        System.out.println("class.class = " + procedure.getClass());
        System.out.println("class.instance  = " + procedure);

        Procedure procedure2 = () -> {
            System.out.println("hello1 lambd!");
        };
    }
}
