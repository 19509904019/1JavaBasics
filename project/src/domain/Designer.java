package domain;

/**
 * ClassName:Designer
 * Description:设计师
 *
 * @Author ZY
 * @Create 2023/9/19 10:45
 * @Version 1.0
 */
public class Designer extends Programmer {
    private double bonus;

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary,
                    Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return getDetails() + "\t设计师\t" + getStatus() + "\t" + bonus
                + "\t\t\t" + getEquipment().getDescription();
    }

    @Override
    public String getDetailsForTeam() {
        return super.getBasicDetailsForTeam() + "设计师\t" + getBonus();
    }
}
