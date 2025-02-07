import attackStrategy.*;
import defenseStrategy.*;

public class Wizard extends Character {
    
    public Wizard() {
        super("Wizard -", new CastSpell(), new CreateMagic());
    }
}
