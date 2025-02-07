package characterContext;
import interfaces.*;

public class Character {
    private Attack attackStrategy;
    private Defend defendStrategy;
    private String name;

    public Character(String name, Attack attackStrategy, Defend defendStrategy) {
        this.name = name;
        this.attackStrategy = attackStrategy;
        this.defendStrategy = defendStrategy;
    }

    public void performAttack() {
        System.out.print(name + " ");
        attackStrategy.attack();
    }

    public void performDefend() {
        System.out.print(name + " ");
        defendStrategy.defend();
    }

     // ✅ Make sure these methods exist
     public void setAttackStrategy(Attack attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setDefendStrategy(Defend defendStrategy) {
        this.defendStrategy = defendStrategy;
    }
}
