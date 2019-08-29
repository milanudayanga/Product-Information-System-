package pis.model;

/**
 *
 * @author milan
 */
public class SingleMalt {

    private String distillery;
    private int age;
    private String Region;
    private int price;

    public SingleMalt(String distillery, int age, String Region, int price) {
        this.distillery = distillery;
        this.age = age;
        this.Region = Region;
        this.price = price;
    }

    public String getDistillery() {
        return distillery;
    }

    public void setDistillery(String distillery) {
        this.distillery = distillery;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "<" + getDistillery() + "," + getAge() + "," + getRegion() + "," + getPrice() + ">";
    }

}
