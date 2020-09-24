package Homework6;

public class Point<z> {

    private int x;
    private int y;

    public void setX(){
        this.x = x;
    }
    public void setY(){
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    public double distance() {
        double distanceToOrigin = Math.sqrt(x * x + y * y);
        return distanceToOrigin;
    }


    public double distance(Point another) {
        int z,t;
        z = another.x;
        t = another.y;
        double distanceBetweenPoints = Math.sqrt((x-z)*(x-z)+(y-t)*(y-t));
        return distanceBetweenPoints;

    }

    public Point() {
    }

    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }

    }




