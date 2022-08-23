package classtest;

/**
 * Created By Alireza Dolatabadi
 * Date: 8/1/2022
 * Time: 8:50 PM
 */
class Building1 {
    //dataz
    //method
    String name;
    int size;
}

public class ClassTest {
    public static void main(String[] args) {
        Building1 building = new Building1();
        building.name = "Apartment";
        building.size = 100;
        System.out.println(building.name);
        System.out.println(building.size);
        Building1 building1 = new Building1();
        building1.name = "Flat";
        building1.size = 60;
        System.out.println(building1.name);
        System.out.println(building1.size);
    }
}
