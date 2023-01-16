package ex2;

public class DeviceOutputPrefixImpl implements DeviceOutput{
    private  String prefix;

    public DeviceOutputPrefixImpl(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public  void print(String message){
        System.out.println(this.prefix + "" + message);
    }
}
