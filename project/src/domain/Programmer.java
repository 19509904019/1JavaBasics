package domain;

/**
 * ClassName:Programmer
 * Description:程序员
 *
 * @Author ZY
 * @Create 2023/9/19 10:41
 * @Version 1.0
 */
public class Programmer extends Employee {
    private int memberId;
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary,
                      Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return getDetails() + "\t程序员\t" + status +
                "\t\t\t\t\t" + equipment.getDescription();
    }

    protected String getBasicDetailsForTeam() {
        return getMemberId() + "/" + getId() + "\t" + getName() + "\t" + getAge() +
                "\t" + getSalary() + "\t";
    }

    public String getDetailsForTeam() {
        return getBasicDetailsForTeam() + "程序员";
    }
}
