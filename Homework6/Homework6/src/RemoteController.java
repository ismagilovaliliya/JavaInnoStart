public class RemoteController {

        public TV myTV;

        public RemoteController(TV tv){
                this.myTV = tv;
        }

        public void randomProgram(int number){
                System.out.println("Show the program on channel number "+ number);
                myTV.getChannel(number);
        }


}
