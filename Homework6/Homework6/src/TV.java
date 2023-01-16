import java.util.ArrayList;

public class TV {
    public boolean turnOn;
    private Channel channels[];

    private int countChannels;
    public TV( int count){
        this.turnOn = true;
        this.channels = new Channel[count];
        this.countChannels = 0;
    }

    //добавить новый канал. Вставляем новый канал в конец списка
    public void setChannel(Channel channel){
       if (countChannels < channels.length) {
            this.channels[countChannels] = channel;
            this.countChannels++;
           System.out.println("The channel "+ channel.getNumber()+ " add");
        }else{
            System.out.println("TV is full");
        }
    }

    public void getChannel(int number){
        if (channels.length >= number || channels[number]!=null) {
            channels[number-1].getRandomProgram();
        }else{
            System.out.println("this channel is not exist");
        }
    }
    //добавить новый канал по номеру
    public void setChannel(Channel channel, int number){
        if (this.channels[number] == null) {
            this.channels[number] = channel;
            this.countChannels++;
        }else {
            System.out.println("Занято!");
        }
    }

    public void turnOnTV(){
        turnOn = true;
    }

    public void turnOffTV(){
        turnOn = false;
    }


}
