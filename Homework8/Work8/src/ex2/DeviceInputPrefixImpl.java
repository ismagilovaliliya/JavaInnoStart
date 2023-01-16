package ex2;

import java.util.Scanner;

public class DeviceInputPrefixImpl implements DeviceInput{
    private Scanner scanner = new Scanner(System.in);
    private String prefix;

    public DeviceInputPrefixImpl(String prefix) {
        this.prefix = prefix;
    }
    @Override
    public  String read(){
        return prefix + " " + scanner.nextLine();
    }
}
