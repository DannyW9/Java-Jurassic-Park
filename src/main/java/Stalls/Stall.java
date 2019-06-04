package Stalls;

public abstract class Stall {

    private String name;
    private String ownerName;
    private String parkingSpot;

    public Stall(String name, String ownerName, String parkingSpot){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
    }

    public String getName() {
        return this.name;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public String getParkingSpot() {
        return this.parkingSpot;
    }
}
