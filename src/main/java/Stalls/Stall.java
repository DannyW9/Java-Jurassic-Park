package Stalls;

import AltJurassicPark.IReviewed;
import AltJurassicPark.ThemePark;

public abstract class Stall extends ThemePark implements IReviewed {

    private String name;
    private String ownerName;
    private String parkingSpot;
    private int rating;

    public Stall(String name, String ownerName, String parkingSpot, int rating){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
    }

    public String getName() {
        return this.name;
    }

    public int getRating(){
        return this.rating;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public String getParkingSpot() {
        return this.parkingSpot;
    }
}
