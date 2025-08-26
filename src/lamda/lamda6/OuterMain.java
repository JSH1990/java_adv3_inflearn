package lamda.lamda6;

public class OuterMain {


    public void execute(){
        //1. 익명 클래스 예시
        Runnable anonymous = new Runnable() {
            private String message = "외부클래스";

            @Override
            public void run() {
                //익명 클래스에서 this는 익명 클래스의 인스턴스를 가르킴
                System.out.println("익명 클래스 " + this);
            }
        };

        //2. 람다 예시
        Runnable lambda = () -> {
            //람다에서의 this는 람다가 선언된 크래스의 인스턴스를 가르킴
            System.out.println("람다 클래스 " + this);
        };

        anonymous.run();
    }

    public static void main(String[] args) {
        OuterMain outerMain = new OuterMain();
        outerMain.execute();
    }
}
