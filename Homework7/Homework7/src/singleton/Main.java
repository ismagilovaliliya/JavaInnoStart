package singleton;

import java.io.PrintStream;
import java.time.LocalDateTime;

public class Main {

    public  static void main(String[] args){

       // Logger logger = new Logger();

        Logger logger = Logger.newLogger();// если вызов через статический метод

       logger.info("send message");
       logger.error("Error");

       //если создать другой логер, то он будет ТОТ ЖЕ САМЫЙ
        Logger anotherLogger = Logger.newLogger();
        //потому что вызывается инстанс, а он уже был создан ранее и он статичный
    }
}
