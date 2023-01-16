package streams;

public class Main {
    public static void main(String[] args) {
        int sourceArray[] = {256,956,1,75,25,565,7};
        IntegerSequence sequence = new IntegerSequence(sourceArray);

        //Consumer consumer = value -> System.out.println(value)
        sequence.forEach(value -> System.out.println(value + 10));
    }
}
