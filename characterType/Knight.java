package characterType;
import attackStrategy.*;
import characterContext.Character;
import defenseStrategy.*;

public class Knight extends Character {
    
    public Knight() {

        super("Knight -", new SwingSword(), new Shield());
    }
}
