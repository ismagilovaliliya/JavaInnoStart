package nested.primitive;

/*
* OuterClass -> Table
* InnerClass -> TablePrinter
*NestedClass -> TableEntered*/

public class OuterClass {

    private  int outerClassField;
    private static int outerClassStaticField;

    //StaticNestedClass, InnerClass -вложенные классы Nested
    //StaticNestedClass - статическиц вложенный класс, nested,static nested
    //InnerClass внутренний класс
    public static class StaticNestedClass{
        public int nestedClassField;

        //имеет доступ только к статическим полям, так как с объектом не ассоциирован
        public void method(){
            System.out.println(nestedClassField  + " " +outerClassStaticField);
        }
    }

    public class InnerClass{
        public int innerClassField;

        //есть доступ ко всему, ко всем полям
        public void method(){
            System.out.println(innerClassField + " " + outerClassField + " " +outerClassStaticField);
        }

    }
}
