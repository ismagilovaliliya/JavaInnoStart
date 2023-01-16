package ex1;

public abstract class Millitary extends Transport {
    protected  int bulletsCount;

    public Millitary(double fuelAmount, double fuelConsumption, int bulletsCount) {
        super(fuelAmount, fuelConsumption);
        this.bulletsCount = bulletsCount;
    }

    public void fire(){
        this.bulletsCount--;
    }

    public int getBulletsCount(){
        return bulletsCount;
    }
}
