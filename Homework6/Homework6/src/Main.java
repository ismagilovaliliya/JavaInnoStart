public class Main {
    public static void main(String[] args) {

        ProgramChannel p1 = new ProgramChannel(9,"Good morning");
        ProgramChannel p2 = new ProgramChannel(10,"News");
        ProgramChannel p3 = new ProgramChannel(11,"TV shows");
        ProgramChannel p4 = new ProgramChannel(12,"Movie");
        ProgramChannel p5 = new ProgramChannel(13,"Cartoon");

       // ProgramChannel programChannel[] = {p1, p2, p3};
       // ProgramChannel programChannel2[] = {p4, p5};


        Channel c1 = new Channel(1);
        Channel c2 = new Channel(2);
        p1.addInChannel(c1);
        p2.addInChannel(c2);
        p3.addInChannel(c1);
        p4.addInChannel(c2);
        p5.addInChannel(c1);

        TV myTV = new TV(5);
        myTV.setChannel(c1);
        myTV.setChannel(c2);

        RemoteController rm = new RemoteController(myTV);
        rm.randomProgram(1);
    }
}