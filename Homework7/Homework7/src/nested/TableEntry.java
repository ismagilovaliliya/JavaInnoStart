package nested;

public class TableEntry {

    private String key;
    private int value;


    public TableEntry(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public String getKey(){
        return key;
    }

    public  int getValue(){
        return value;
    }


}
