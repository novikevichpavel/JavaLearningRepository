package Lesson6;

/*
Перегрузка методов - это кгда создано несколько методов с одинаковыми именами, но эти методы имеют разные типы входных параемтеров
*/

public class MethoOverloading {

    void show(int i) {
        System.out.println(i);
        System.out.println("Data type is int");
    }

    void show(boolean b){
        System.out.println(b);
        System.out.println("Data type is Bool");
    }

    void show(int a, String s) {
        System.out.println("Int: " + a + " String: " + s);
    }

    void show(String a, int s) {
        System.out.println("Int: " + s + " String: " + a);
    }

}

class MethodOverloadingTest {

    public static void main(String[] args) {

        MethoOverloading mO = new MethoOverloading();
        int a = 500;
        mO.show(a);
        boolean b = true;
        mO.show(b);

    }

}