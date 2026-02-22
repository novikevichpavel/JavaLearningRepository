package Lesson6;

public class MethodOverloading2 {

    int sum (int a, int b){
        return a + b;
    }

    String sum (String a, String b){
        return a + b;
    }
}

class MethodOverloading2Test {
    public static void main(String[] args) {
        MethodOverloading2 test = new MethodOverloading2();
        int tetsTest = test.sum(2, 4);
        System.out.println(tetsTest);
        String strTest = test.sum("AbC", "ACD");
        System.out.println(strTest);
    }
}
