package accessor;

import accessor.objects.TestObject;
import accessor.objects.TestObjectChild;

/**
 * Created By Alireza Dolatabadi
 * Date: 8/7/2022
 * Time: 3:15 PM
 */
public class Test {
    public static void main(String[] args) {
        TestObject testObject = new TestObject("testing");
        System.out.println(testObject.toString());

        TestObjectChild testObjectChild = new TestObjectChild("TestObjectChild");

    }
}
/*
    Private = Class
    noModifier = Class , Package
    Protected = Subclass , Package , Class
    public = Class , Subclass , Package , World
 */
