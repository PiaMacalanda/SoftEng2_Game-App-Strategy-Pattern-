package characterType;
import attackStrategy.*;
import characterContext.Character;
import defenseStrategy.*;

public class Wizard extends Character {
    
    public Wizard() {
        super("Wizard -", new CastSpell(), new CreateMagic());
    }
}
