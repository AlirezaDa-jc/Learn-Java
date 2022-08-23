package accessor.objects;

import accessor.objects.TestObject;

/**
 * Created By Alireza Dolatabadi
 * Date: 8/7/2022
 * Time: 3:27 PM
 */
public class TestObjectChild extends TestObject {

    public TestObjectChild(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Name  : " + name;
    }
}
