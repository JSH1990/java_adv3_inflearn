package lamda.lamda2;

import lamda.MyFunction;

public class LambdaPassMain3 {
    public static void main(String[] args) {
        MyFunction add = getOperation("add");
        System.out.println("add.apply(1,2) = " + add.apply(1, 2));
    }

    static MyFunction getOperation(String operator){
        switch (operator){
            case "add" :
                return (a,b) -> a+b;
            case "sub":
                return (a,b) -> a-b;
            default:
                return (a,b) -> 0;
        }
    }
}
