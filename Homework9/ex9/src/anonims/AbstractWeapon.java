package anonims;

public abstract class AbstractWeapon {
    private int bulletsCount;


    public AbstractWeapon(int bulletsCount) {
        this.bulletsCount = bulletsCount;
    }

    public abstract void fire();


    public void reload(int bulletsCount){
        this.bulletsCount = bulletsCount;

    }

}
