package attackStrategy;
import interfaces.Attack;

public class SwingSword implements Attack {
    
    @Override
    public void attack() {
        
        System.out.println("Knight attacks with a sword!");
    }
}
