package ex2;

public class Main {
    public static void main(String[] args) {
        DeviceOutputPrefixImpl deviceOutput = new DeviceOutputPrefixImpl("Message: ");
       // deviceOutput.print("Hello");

        DeviceInputPrefixImpl deviceInput = new DeviceInputPrefixImpl("From console: ");
      //  System.out.println(deviceInput.read());


        IOService service = new IOService(deviceInput,deviceOutput);
        service.print("Hello!");
        System.out.println(service.read());

        DeviceOuputTimeImpl deviceOuputTime = new DeviceOuputTimeImpl();
        deviceOuputTime.print("Bye");
    }
}
