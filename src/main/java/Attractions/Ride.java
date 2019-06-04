package Attractions;

import AltJurassicPark.ISecurity;
import AltJurassicPark.Visitor;

public class Ride extends Attraction implements ISecurity {


    public Ride() {
        super("T-Rex Rides");
    }

    public boolean isAllowedTo(Visitor visitor) {
        return ((visitor.getAge() >= 18) && (visitor.getHeight() >= 180));
    }
}
