package accessor.objects;

/**
 * Created By Alireza Dolatabadi
 * Date: 8/7/2022
 * Time: 3:17 PM
 */
public class TestObject {
    protected String name;

    public TestObject(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name  : " + name;
    }
}
