package ex2;

//паттерн Фасад
public class IOService {
    private DeviceInput deviceInput;
    private DeviceOutput deviceOutput;


    public IOService(DeviceInput deviceInput, DeviceOutput deviceOutput) {
        this.deviceInput = deviceInput;
        this.deviceOutput = deviceOutput;
    }

    public void  print(String message){
        this.deviceOutput.print(message);
    }

    public String read(){
        return this.deviceInput.read();

    }
}
