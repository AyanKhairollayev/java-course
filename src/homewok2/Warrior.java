package homewok2;

public class Warrior extends Hero {
    public Warrior() {
        super.setPhysDef(0.8);
        super.setPhysAttack(30);
    }

    @Override
    public String toString() {
        return "Warrior{health=" + super.getHealth() + "}";
    }
}
