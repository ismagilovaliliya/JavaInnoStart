package builder.pattern;

public class Example {

    private String text;

    public Example append(String text){
        this.text += text;
        return this;
    }

    public String getText(){
        return text;
    }
}
