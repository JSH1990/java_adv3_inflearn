package lamda.start;

public class ExMain {
    public static void main(String[] args) {
        hello("Java");
        hello("Spring");
    }

    private static void hello(String lan) {
        System.out.println("프로그램 시작");
        System.out.println(lan);
        System.out.println("프로그램 종료");
    }
}
