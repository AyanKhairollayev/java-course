package homewok2;

public abstract class Hero implements PhysAttack {
    private final int MIN_HEALTH = 0;
    private int health;
    private int physAttack;
    private double physDef;
    private double magDef;

    public Hero() {
        this.health = 100;
    }

    @Override
    public void physicalAttack(Hero h) {
        double attackScore = physAttack * (1 - h.getPhysDef());

        if(h.getHealth() - attackScore <= MIN_HEALTH) {
            h.setHealth(MIN_HEALTH);
        } else {
            h.setHealth((int) (h.getHealth() - attackScore));
        }
    }

    public int getMIN_HEALTH() {
        return MIN_HEALTH;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPhysAttack() {
        return physAttack;
    }

    public void setPhysAttack(int physAttack) {
        this.physAttack = physAttack;
    }

    public double getPhysDef() {
        return physDef;
    }

    public void setPhysDef(double physDef) {
        this.physDef = physDef;
    }

    public double getMagDef() {
        return magDef;
    }

    public void setMagDef(double magDef) {
        this.magDef = magDef;
    }
}
