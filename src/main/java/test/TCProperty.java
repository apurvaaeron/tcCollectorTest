package test;

/**
 * Created by apurv on 12-08-2018.
 */
public class TCProperty {

    private String name;
    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TCProperty{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
