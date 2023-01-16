package hw;

public class Rectangle extends Figure implements Movable{

    public float length;
    public float width;

    public Rectangle(float x, float y, float length, float width) {
        super(x, y);
        this.length = length;
        this.width = width;
    }

    @Override
    public float getArea(){
        return length*width;
    }

    @Override
    public float getPerimetr(){
        return 2*(length + width);
    }

    @Override
    public void moveXY(float x, float y){
        this.x -=x;
        this.y -=y;
    };

    @Override
    public void moveXYkoef(float koef){
        this.length *=koef;
        this.width *=koef;
    }
}
