package hw;

public abstract class Figure {

    /*центр фигуры или точка отсчета*/
    protected float x;
    protected float y;
    public Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }
    public abstract float getArea();
    public abstract float getPerimetr();
}
