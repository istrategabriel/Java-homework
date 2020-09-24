package Homework6;

public class Homework6 {

    public static void main(String[] args) {
        Wall perete1 = new Wall();
        perete1.setWidth(-2);
        perete1.setHeight(4);
        System.out.println("Area = " + perete1.getArea());
        Wall perete2 = new Wall(5,4);
        System.out.println("Area = "+ perete2.getArea());
        Point first = new Point(6,5);
        Point second = new Point(3,1);
        System.out.println("distance(0,0) =" + first.distance());
        System.out.println("distance(second = " +first.distance(second));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());



    }

}
