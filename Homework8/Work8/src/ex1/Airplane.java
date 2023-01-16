package ex1;

public class Airplane extends Transport{
    private double length;
    public Airplane(double fuelAmount, double fuelConsumption, double length) {
        //вызов контруктора предка
        super(fuelAmount, fuelConsumption);
        this.length = length;
    }

    public double getLength(){
        return  length;
    }

    //переопределние метода - мишем новую реализацию метода, который есть у предка
    // метод должен полностью повторять сигнатуру предка
    @Override //проверка на переопределение
    public void go(int km){
        System.out.println("Я самолет и я лечу");
        this.fuelAmount -= (km*fuelConsumption)/100;
        this.fuelConsumption = -0.1;
    }

    //перегрузка метода
 /*   public void go(int km, int speed){
        System.out.println("Я самолет и я лечу");
        this.fuelAmount -= (km*fuelConsumption)/100;
        this.fuelConsumption = -0.1;
    }*/

    @Override
    public void stop(){
        System.out.println("Приземляюсь!");
    }

}
