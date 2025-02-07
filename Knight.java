import attackStrategy.*;
import defenseStrategy.*;

public class Knight extends Character {
    
    public Knight() {

        super("Knight -", new SwingSword(), new Shield());
    }
}
