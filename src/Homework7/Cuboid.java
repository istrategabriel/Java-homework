package Homework7;

public class Cuboid extends Rectangle {

    private double height;

    public double getHeight() {
        return height;
    }


    public Cuboid (double width1, double lenth1, double height1){
        super (1.0, 1.0);
       if (height1<0){
           height = 0;
           return;
       }
       setWidth(width1);
       setLength(lenth1);
       height = height1;


           }

           public double getVolume(){
        double volume = height*getWidth()*getLength();
        return volume;

           }

    public static void main(String[] args) {
       Rectangle rectangle = new Rectangle(5,10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

    }

}
