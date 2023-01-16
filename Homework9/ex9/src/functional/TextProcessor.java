package functional;

import java.util.SplittableRandom;

public class TextProcessor {

    private String lines[];
    private String format;

    public  TextProcessor(String[] lines, String format){
        this.lines = lines;
        this.format = format;
    }

    public String[] process(ConvertFunction function){
        String result[] = new String[lines.length];
        for(int i=0; i< lines.length; i++){
            result[i] = function.convert(lines[i], format);
        }
        return result;
    }
}
