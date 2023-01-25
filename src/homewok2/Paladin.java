package homewok2;

public class Paladin extends Hero implements Healer {
    private static final int MAX_HEALTH = 100;
    private static final int HEAL_AMOUNT = 25;
    private static final int HEAL_TEAMMATE_AMOUNT = 20;

    public Paladin() {
        super.setPhysDef(0.5);
        super.setMagDef(0.2);
        super.setPhysAttack(15);
    }

    @Override
    public void healHimself() {
        if(this.getHealth() + HEAL_AMOUNT >= MAX_HEALTH) {
            this.setHealth(MAX_HEALTH);
        } else {
            this.setHealth(this.getHealth() + HEAL_AMOUNT);
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if(hero.getHealth() + HEAL_TEAMMATE_AMOUNT >= MAX_HEALTH) {
            hero.setHealth(MAX_HEALTH);
        } else {
            hero.setHealth(hero.getHealth() + HEAL_TEAMMATE_AMOUNT);
        }
    }

    @Override
    public String toString() {
        return "Paladin{health=" + super.getHealth() + "}";
    }
}
