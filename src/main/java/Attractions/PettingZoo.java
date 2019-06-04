package Attractions;

import AltJurassicPark.ISecurity;
import AltJurassicPark.Visitor;

public class PettingZoo extends Attraction implements ISecurity {

    public PettingZoo(){
        super("Petting Zoo");
    }


    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() <= 12);
    }
}


