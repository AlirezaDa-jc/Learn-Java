package dowhile;

import java.util.Scanner;

/**
 * Created By Alireza Dolatabadi
 * Date: 7/29/2022
 * Time: 5:10 PM
 */
public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
/*        int i = sc.nextInt();
        while (i != -1) {
            System.out.println("You Are In While Loop");
            i = sc.nextInt();
        }*/
        int i;
        do {
            System.out.println("We Are In Do While");
            i = sc.nextInt();
        } while (i != -1);

        System.out.println("Your Value Is :" + i);
    }
}
