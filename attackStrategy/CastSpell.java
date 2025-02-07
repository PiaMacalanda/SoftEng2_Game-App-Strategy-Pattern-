package attackStrategy;
import interfaces.Attack;

public class CastSpell implements Attack {
    
    @Override
    public void attack() {
        System.out.println("Wizard casts a spell!");
    }
}
