package loop;

/**
 * Created By Alireza Dolatabadi
 * Date: 7/28/2022
 * Time: 6:13 PM
 */
public class While {
    public static void main(String[] args) {
        int value = 0;
        while (value <= 10) {
            System.out.println(value);
            value++;
        }

        while (true) {
            System.out.println("First time");
            if (value > 10) {
                break;
            }
            System.out.println(value);
            value++;
        }
        while (true) {
            System.out.println("first time");
            break;
        }
    }
}
