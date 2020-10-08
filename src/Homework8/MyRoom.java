package Homework8;

public class MyRoom {

    private Walls wall1;
    private Walls wall2;
    private Walls wall3;
    private Walls wall4;
    private Furniture furniture;

    public MyRoom(Walls wall1, Walls wall2, Walls wall3, Walls wall4, Furniture furniture) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.furniture = furniture;
    }

    public static void main(String[] args) {

        Doors door1 = new Doors(2.2, 0.8, 0.1, 0, "Wood");
        Doors door2 = new Doors(2.2, 0.6, 0.1, 0, "PVC");
        Windows window1 = new Windows(1, 0.5, 0.1, 0, "PVC");
        Walls wall11 = new Walls(3.25, 0.0, 0.2, 5.85, "Concrete",
                1, door1, null);
        Walls wall12 = new Walls(3.25, 0.0, 0.2, 5.85, "Concrete",
                1, null, null);
        Walls wall13 = new Walls(3.25, 3.5, 0.4, 0.0, "Concrete",
                0, door2, window1);
        Walls wall14 = new Walls(3.25, 3.5, 0.4, 0.0, "Concrete",
                0, null, null);
        Furniture mobila = new Furniture(3.0, 3.5, 0.4, 0.0, "PAL", "Brown", "Book Storage");
        MyRoom living = new MyRoom(wall11, wall12, wall13, wall14, mobila);

        System.out.println(living.furniture.getHeight());
        System.out.println(living.furniture.getMaterial());
        System.out.println(living.wall1.getLength());
        System.out.println(living.wall2.getNrOfElectricalSockets());
        System.out.println(door1.getMaterial());



    }
}