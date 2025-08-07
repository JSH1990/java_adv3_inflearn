package lamda.ex2;

public class ComposeExample {
    public static MyTransformer compose(MyTransformer f1, MyTransformer f2){
        return s -> {
            String intermediate = f1.transform(s);
            return f2.transform(intermediate);
        };
    }

    public static void main(String[] args) {
        MyTransformer toUpper = s -> s.toUpperCase();
        MyTransformer addDeco = s -> "**" + s + "**";
        MyTransformer composeFunc = compose(toUpper, addDeco);

        String result = composeFunc.transform("hello");
        System.out.println("result = " + result);
    }
}
