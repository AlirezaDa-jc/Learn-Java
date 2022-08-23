package condition;

/**
 * Created By Alireza Dolatabadi
 * Date: 7/28/2022
 * Time: 10:17 PM
 */
public class TestIf {
    public static void main(String[] args) {
//        boolean condition = 4 > 5;//false
        /*if (4 > 5) {
            System.out.println("It's True");
        } else if (6 < 5) {
            System.out.println("Second Condition is true");
        } else {
            System.out.println("All of the conditions are false");
        }*/

        String java = "Java";

        if (java.equals("php")) {
            System.out.println("I'm Learning php");
        } else if (java.equals("C#")) {
            System.out.println("I'm Learning C#");
        } else if (java.equals("Java")) {
            System.out.println("I'm Learning Java");
        } else {
            System.out.println("None Of conditions are true");
        }
    }
}
