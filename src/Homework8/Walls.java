package Homework8;

public class Walls  extends Dimensions{

    private String wallMaterial;
    private int nrOfElectricalSockets;
    private Doors doors;
    private Windows windows;

    public Walls(double height, double width, double depth, double length, String wallMaterial, int nrOfElectricalSockets, Doors doors, Windows windows) {
        super(height, width, depth, length);
        this.wallMaterial = wallMaterial;
        this.nrOfElectricalSockets = nrOfElectricalSockets;
        this.doors = doors;
        this.windows = windows;
    }

    public String getWallMaterial() {
        return wallMaterial;
    }

    public int getNrOfElectricalSockets() {
        return nrOfElectricalSockets;
    }

    public Doors getDoors() {
        return doors;
    }

    public Windows getWindows() {
        return windows;
    }
}
