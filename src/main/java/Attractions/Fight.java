package Attractions;

import AltJurassicPark.ISecurity;
import AltJurassicPark.Visitor;

public class Fight extends Attraction implements ISecurity {

    public Fight(){
        super("Dinosaur Boxing", 5);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() >= 18);
    }
}
