package statics;

public class Main {
    public static void main(String[] args) {


        SomeClass s1 = new SomeClass();
        SomeClass s2 = new SomeClass();
        SomeClass s3 = new SomeClass();

        s1.b = 19;
        s2.b = 20;
        s3.b = 21;

        s2.someMethod();

        //SomeClass.a =35;

        System.out.println(s1.b + " "+ SomeClass.a);
        System.out.println(s2.b + " "+ SomeClass.a);
        System.out.println(s3.b + " "+ SomeClass.a);

        SomeClass.someStaticMethod();
        System.out.println(SomeClass.a);
    }
}