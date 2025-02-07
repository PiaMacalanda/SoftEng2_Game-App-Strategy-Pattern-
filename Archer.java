import attackStrategy.*;
import defenseStrategy.*;

public class Archer extends Character {
    
    public Archer() {
        super("Archer -", new ShootArrow(), new Dodge());
    }
}
