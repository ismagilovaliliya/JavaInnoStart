package streams;

public class IntegerSequence {
    private  int sequence[];

    public IntegerSequence(int[] sequence) {
       this.sequence = new int[sequence.length];
       for (int i = 0; i < sequence.length; i++){
           this.sequence[i] = sequence[i];
       }
    }

    public IntegerSequence filter(){
        return  null;
    }

    public IntegerSequence map(){
        return  null;
    }

    public void forEach(Consumer consumer){
        for(int i =0; i< sequence.length; i++){
            consumer.apply(sequence[i]);
        }
    }
}
