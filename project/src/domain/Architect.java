package domain;

/**
 * ClassName:Architect
 * Description:架构师
 *
 * @Author ZY
 * @Create 2023/9/19 10:46
 * @Version 1.0
 */
public class Architect extends Designer {
    private int stock;

    public Architect() {

    }

    public Architect(int id, String name, int age, double salary,
                     Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getDetails() + "\t架构师\t" + getStatus() + "\t" + getBonus()
                + "\t" + stock + "\t" + getEquipment().getDescription();
    }

    @Override
    public String getDetailsForTeam() {
        return super.getBasicDetailsForTeam() + "架构师\t" + getBonus() + "\t" + getStock();
    }
}
