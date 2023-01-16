package hw;

public class Square extends Figure implements Movable{

    public float length;

    public Square(float x, float y, float length) {
        super(x, y);
        this.length = length;
    }

    @Override
    public float getArea(){
        return (float)Math.pow(length,2);
    }

    @Override
    public float getPerimetr(){
        return 4 * length;
    }

    @Override
    public void moveXY(float x, float y){
        this.x -=x;
        this.y -=y;
    };

    @Override
    public void moveXYkoef(float koef){
        this.length *=koef;
    }
}
