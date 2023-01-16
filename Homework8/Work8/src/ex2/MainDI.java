package ex2;

public class MainDI {
    public static void main(String[] args) {
       // DeviceOutput deviceOutput = new DeviceOutputPrefixImpl("Message ");
       DeviceOutput deviceOutput = new DeviceOuputTimeImpl();
        DeviceInput deviceInput = new DeviceInputPrefixImpl("from console ");

        IOService ioService = new IOService(deviceInput, deviceOutput);

        ioService.print("Hello!");
        System.out.println(ioService.read());
    }
}
