package builder.primitive;

public class Box {

    private  int a;
    private  int b;

    private Box(int a, int b){
        this.a = a;
        this.b = b;
    }

    //оборачивание в статический метод
    public static Box create(int a, int b){
        return new Box(a,b);
    }
}
