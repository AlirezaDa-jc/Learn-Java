package input;

import java.util.Scanner;

/**
 * Created By Alireza Dolatabadi
 * Date: 7/29/2022
 * Time: 5:01 PM
 */
public class TestInput {
    public static void main(String[] args) {
        //Create Scanner Object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your input : ");

        //Scanner Methods
//        int input = sc.nextInt();
//        String input = sc.nextLine();
//        String input = sc.next();
//        double input = sc.nextDouble();
//        long input = sc.nextLong();
//        boolean input = sc.nextBoolean();
        float input = sc.nextFloat();


        System.out.println("Data You Entered : " + input);
    }
}
