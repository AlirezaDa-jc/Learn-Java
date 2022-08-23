package interfaces;

/**
 * Created By Alireza Dolatabadi
 * Date: 8/7/2022
 * Time: 2:33 PM
 */
public class InterfaceTest {
    public static void main(String[] args) {
/*        Person person = new Person("Alireza",21);
        Machine machine = new Machine("Computer" , "Germany");
        person.showInfo();
        person.walk();
        machine.showInfo();
        person.work();*/
        ShowInfo person = new Person("Alireza" , 21);
        ShowInfo machine = new Machine("Computer" , "Germany");
        showInfo(person);
        showInfo(machine);
    }

    private static void showInfo(ShowInfo person) {
        person.showInfo();
    }
}
