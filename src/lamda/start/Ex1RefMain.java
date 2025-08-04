package lamda.start;

import lamda.Procedure;

import java.util.Random;

public class Ex1RefMain {
    public static void hello(Procedure procedure){
        long startNs = System.nanoTime();

        //코드 조각 시작
        procedure.run();
    }

    static class Dice implements Procedure{

        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        }
    }

    static class Sum implements Procedure{

        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        Procedure sum = new Sum();
        Procedure dice = new Dice();

        hello(sum);
        hello(dice);

    }
}
