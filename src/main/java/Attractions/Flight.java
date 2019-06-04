package Attractions;

import AltJurassicPark.ISecurity;
import AltJurassicPark.Visitor;

public class Flight extends Attraction implements ISecurity {

    public Flight(){
        super("Pterodactyl Rides");
    }

    public boolean isAllowedTo(Visitor visitor) {
        return ((visitor.getAge() >= 14) && (visitor.getHeight() <= 180));
    }
}
