package defenseStrategy;
import interfaces.Defend;

public class Shield implements Defend {
    
    @Override
    public void defend() {
        
        System.out.println("Using a shield to defend!");
    }
}
