package defenseStrategy;
import interfaces.Defend;

public class Dodge implements Defend {
    
    @Override
    public void defend() {
        
        System.out.println("Dodging to avoid attack!");
    }
}
