package homewok2;

public class Shaman extends Hero implements MagAttack, Healer{
    private static final int MAX_HEALTH = 100;
    private static final int HEAL_AMOUNT = 50;
    private static final int HEAL_TEAMMATE_AMOUNT = 30;
    int magicAttack = 15;

    public Shaman() {
        this.setPhysDef(0.2);
        this.setMagDef(0.2);
        this.setPhysAttack(10);
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
    public void magicalAttack(Hero hero) {
        double attackScore = magicAttack * (1 - hero.getMagDef());

        if(hero.getHealth() - attackScore <= super.getMIN_HEALTH()) {
            hero.setHealth(super.getMIN_HEALTH());
        } else {
            hero.setHealth((int) (hero.getHealth() - attackScore));
        }
    }

    @Override
    public String toString() {
        return "Shaman{health=" + super.getHealth() + "}";
    }
}
