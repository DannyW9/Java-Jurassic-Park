package Attractions;

import AltJurassicPark.ISecurity;
import AltJurassicPark.ITicketed;
import AltJurassicPark.Visitor;

public class Flight extends Attraction implements ISecurity, ITicketed {

    public Flight(){
        super("Pterodactyl Rides", 6);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return ((visitor.getAge() >= 14) && (visitor.getHeight() <= 180));
    }

    public double defaultPrice() {
        return 5;
    }

    public double priceFor(Visitor visitor) {
        if (visitor.getAge() <= 18){
            return defaultPrice() / 2;
        }
        return defaultPrice();
    }
}
