package ex1;

public class MilitaryAirplane extends Airplane{

    private int bulletsCount;

    public MilitaryAirplane(double fuelAmount, double fuelConsumption, double length,int bulletsCount) {
        super(fuelAmount, fuelConsumption, length);
        this.bulletsCount = bulletsCount;
    }

    public void fire(){
        this.bulletsCount--;
    }

    public int getBulletsCount() {
        return bulletsCount;
    }
}
