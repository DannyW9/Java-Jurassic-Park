package Stalls;

import AltJurassicPark.ISecurity;
import AltJurassicPark.Visitor;

public class Alcohol extends Stall implements ISecurity {

    public Alcohol(){
        super("Dino Bar", "Jeff Goldblum", "North");
    }

    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() >= 18);
    }
}
