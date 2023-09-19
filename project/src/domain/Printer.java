package domain;

/**
 * ClassName:Printer
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/19 10:53
 * @Version 1.0
 */
public class Printer implements Equipment {
    private String name;
    private String type;

    public Printer() {
    }

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String getDescription() {
        return name + "(" + type + ")";
    }
}
