package homewok2;

public class Magician extends Hero implements MagAttack {
    int magicAttack = 20;

    public Magician() {
        this.setPhysDef(0);
        this.setMagDef(0.8);
        this.setPhysAttack(5);
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
        return "Magician{health=" + super.getHealth() + "}";
    }
}
