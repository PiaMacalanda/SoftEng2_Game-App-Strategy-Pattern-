package attackStrategy;
import interfaces.Attack;

public class ShootArrow implements Attack {

    @Override
    public void attack() {
        
        System.out.println("Archer shoots an arrow!");
    }
}
