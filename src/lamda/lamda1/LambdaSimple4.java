package lamda.lamda1;

public class LambdaSimple4 {
    public static void main(String[] args) {
        MyCall call = (int value) -> value * 2;
        MyCall call2 = (value -> value * 2);
        MyCall call3 = value -> value * 2; //매개변수 1개 일때 () 생략 가능
    }

    interface MyCall{
        int call(int value);
    }
}
