package singleton;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Logger {

    private final static Logger instance;

    static {
        instance = new Logger();
    }

    private Logger(){

    }

    //всегда будет один и тот же объект
    public static Logger newLogger(){
        return instance;
    }
    public void info(String message){
        System.out.println(createMessage(message));
    }

    public void error(String message){
        System.err.println(createMessage(message));

    }

    private String createMessage(String message){
       return LocalDateTime.now().toString()+ " : "+ message;
    }
}
