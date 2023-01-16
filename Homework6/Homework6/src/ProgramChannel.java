public class ProgramChannel {

    int  time;
    String name;
    Channel channel;

    public ProgramChannel(int time, String name){
        this.time = time;
        this.name = name;
    }

    public void addInChannel(Channel channel)
    {
        this.channel = channel;
        this.channel.addProgram(this);
        System.out.println("The program " +this.name +" add in "+ channel.getNumber() + " channel number");
    }

    public void set(int time){
        this.time = time;
    }

    public int getTime(){
        return this.time;
    }

    public void set(String name){
        this.time = time;
    }

    public String getName(){
        return this.name;
    }
}


/*
* public - доступен везде
* private - модификатор доступа, не доступен вне класса
* отсутствие модифкатора доступа  = пакетный. В рамках одного пакета
* закрытый(приватный) - уровень доступа
* getTime() - метод доступа
* */