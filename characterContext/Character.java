package characterContext;
import interfaces.*;

public class Character {

    private Attack attackStrategy;
    private Defend defendStrategy;
    private String type;

    public Character(String type, Attack attackStrategy, Defend defendStrategy) {

        this.type = type;
        this.attackStrategy = attackStrategy;
        this.defendStrategy = defendStrategy;
    }

    public void performAttack() {

        System.out.print(type + " ");
        attackStrategy.attack();
    }

    public void performDefend() {

        System.out.print(type + " ");
        defendStrategy.defend();
    }

     public void setAttackStrategy(Attack attackStrategy) {

        this.attackStrategy = attackStrategy;
    }

    public void setDefendStrategy(Defend defendStrategy) {
        
        this.defendStrategy = defendStrategy;
    }
}
