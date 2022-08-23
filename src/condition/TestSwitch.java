package condition;

/**
 * Created By Alireza Dolatabadi
 * Date: 7/28/2022
 * Time: 10:28 PM
 */
public class TestSwitch {
    public static void main(String[] args) {
        String java = "Java";
        switch (java) {
            case "php":
                System.out.println("I'm Learning php");
                break;
            case "Java":
                System.out.println("I'm Learning Java");
                break;
            case "C#":
                System.out.println("I'm Learning C#");
                break;
            default:
                System.out.println("None Of conditions are true");
                break;
        }
    }
}
