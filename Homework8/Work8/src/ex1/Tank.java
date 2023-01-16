package ex1;

public  class Tank extends Millitary{
    private  double angle;

    //конструктор потомка
    public Tank(int bulletsCount, double fuelAmount, double fuelConsumption, double angle){
        super(fuelAmount, fuelConsumption,bulletsCount );// онструктор предка
        this.angle = angle;
    }

    public void round(){
        if(this.angle > -1){
            this.angle -= 0.1;
        }else if(this.angle < 1 ) {
            this.angle += 0.1;
        }
    }
    @Override
    public void stop(){
        System.out.println("Стоп машина!");
    }

}
