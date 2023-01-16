package hw;

import ex2.Main;

public class Circle extends Figure implements Movable{

    public float radius;

    public Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
    }
    @Override
    public float getArea(){
        return (float)(Math.PI * Math.pow(radius,2));
    }

    @Override
    public float getPerimetr(){
        return (float)(2 * Math.PI * radius);
    }

    @Override
    public void moveXY(float x, float y){
        this.x +=x;
        this.y +=y;
    };

    @Override
    public void moveXYkoef(float koef){
        this.radius *=koef;
    }

    public float getRadius(){
        return  radius;
    }
}
