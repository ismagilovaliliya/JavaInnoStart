package ex2;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class DeviceOuputTimeImpl implements DeviceOutput{
    @Override
    public void print(String message){
        System.out.println(LocalTime.now().toString() + " " + message );

    }



}
