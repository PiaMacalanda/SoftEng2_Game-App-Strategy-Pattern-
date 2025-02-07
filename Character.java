import interfaces.Attack;
import interfaces.Defend;

public class Character {
    private Attack attackStrategy;
    private Defend defendStrategy;
    private String name;

    public Character(String name, Attack attackStrategy, Defend defendStrategy) {
        this.name = name;
        this.attackStrategy = attackStrategy;
        this.defendStrategy = defendStrategy;
    }

    public void attack() {
        System.out.print(name + " ");
        attackStrategy.attack();
    }

    public void defend() {
        System.out.print(name + " ");
        defendStrategy.defend();
    }

    // Setters for dynamic behavior change
    public void setAttackStrategy(Attack attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void setDefendStrategy(Defend defendStrategy) {
        this.defendStrategy = defendStrategy;
    }
}
