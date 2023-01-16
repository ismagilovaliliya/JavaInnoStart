package statics;

import java.util.Random;

public class SomeClass {

    public static final int MAX_AGE = 100; //константа
    int b;
    //статическое поле
    static int a = 155; // нет сымсла в инициалиазции, так как статик снизу перетрет

    //статический инициализвтор( статический конструктор)
    static {

        Random random = new Random();
        a = random.nextInt(100);
    }

    public void someMethod() {
        this.b = 777;
        a = 888;
    }

    public void someMethod(int a) {
        SomeClass.a = a; // хороший тон написания переменной
    }

    public static void someStaticMethod() {
        //this.b = 5;// нельзя потому что метод статический и не предпололагет наличие объекта
        a = 500;
    }
}