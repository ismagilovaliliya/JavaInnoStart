package hw;

public class Ellipse extends Figure implements Movable {

    private float radius;
    private float radiusBig;

    public Ellipse(float x, float y, float radius, float radiusBig) {
        super(x,y);
        this.radius = radius;
        this.radiusBig = radiusBig;
    }
    @Override
    public float getArea(){
        return (float)(Math.PI * radius * radiusBig);
    }
    @Override
    public float getPerimetr(){
        return (float)(Math.PI * (radius + radiusBig));
    }

    @Override
    public void moveXY(float x, float y){
        this.x +=x;
        this.y +=y;
    };

    @Override
    public void moveXYkoef(float koef){
        this.radius *=koef;
        this.radiusBig *=koef;
    }
}
