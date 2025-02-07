package characterType;
import attackStrategy.*;
import characterContext.Character;
import defenseStrategy.*;

public class Archer extends Character {
    
    public Archer() {
        
        super("Archer -", new ShootArrow(), new Dodge());
    }
}
