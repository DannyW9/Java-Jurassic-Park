package Attractions;

import AltJurassicPark.ISecurity;
import AltJurassicPark.ITicketed;
import AltJurassicPark.Visitor;

public class Ride extends Attraction implements ISecurity, ITicketed {


    public Ride() {
        super("T-Rex Rides", 10);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return ((visitor.getAge() >= 18) && (visitor.getHeight() >= 180));
    }

    public double defaultPrice() {
        return 10;
    }

    public double priceFor(Visitor visitor) {
        if(visitor.getHeight() >= 200){
            return defaultPrice() * 2;
        }
        return defaultPrice();
    }
}
