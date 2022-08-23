package teststatic;

/**
 * Created By Alireza Dolatabadi
 * Date: 8/4/2022
 * Time: 3:26 PM
 */
class Machine {
    final String name;
    final static String description = "description";

    public Machine() {
        this.name  = " ";
    }

    public Machine(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("my name is " + name);
//        System.out.println(description);
//        printDescription();
    }

    public static void printDescription() {
        System.out.println("Description : " + description );
//        System.out.println(name);
//        printName();
    }
}

public class TestStatic {
    public static void main(String[] args) {
        Machine machine = new Machine("Benz");
        Machine machine1 = new Machine("BMW");
//        machine.name = "Benz";
//        machine1.name = "BMW";
//        Machine.description = "I am a Machine";
        machine.printName();
        machine1.printName();
        Machine.printDescription();
    }
}
