import java.util.Random;

public class Channel {

    int number;
    String name;
    private ProgramChannel programChannels[];
    private int countChannel;

    public Channel(int number, String name){
        this.number = number;
        this.name = name;
    }
    public Channel(int number){
        this.number = number;
        this.programChannels = new ProgramChannel[10];
    }
    public int getNumber(){
        return this.number;
    }
   public void addProgram(ProgramChannel programChannel){
       this.programChannels[countChannel] = programChannel;
       this.countChannel++;

   }

    public void setChannel(int channel){

        this.number = channel;
    }

    public int getChannel(){
        return number;
    }

    public void channelUp(){
        number++;
        System.out.println("Текущий канал"+ number);
    };

    public void channelDown(){
        number--;
        System.out.println("Текущий канал"+ number);
    }
    public void getRandomProgram(){
        int count =0;

        for( int i =0; i< this.programChannels.length; i++){
            if (this.programChannels[i] != null) count++;
        }
        System.out.println("all programs " +count);

        Random random = new Random();
        int i = random.nextInt(count);
        String chPr = this.programChannels[i].name;
        System.out.println("random i = "+i+" and name program " +chPr);
    }
}
