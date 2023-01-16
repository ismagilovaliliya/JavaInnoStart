package ex1;

public abstract class Transport {

    //protected  доступен в потомке и тек классе
    protected double fuelAmount;
    protected  double fuelConsumption;

    public Transport(double fuelAmount, double fuelConsumption) {
        this.fuelAmount = fuelAmount;
        this.fuelConsumption = fuelConsumption;
    }

    public void go(int km){
        this.fuelAmount -= (km*fuelConsumption)/100;
    }

    public double getFuelAmount(){
        return fuelAmount;
    }

    //этот метод все потомки обязаны реализовать
   public abstract void stop();
}
