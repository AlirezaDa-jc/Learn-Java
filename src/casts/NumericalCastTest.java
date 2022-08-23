package casts;

/**
 * Created By Alireza Dolatabadi
 * Date: 8/8/2022
 * Time: 5:43 PM
 */
public class NumericalCastTest {
    public static void main(String[] args) {
        int myInt = 500;
        long myLong = -10000L;
        double myDouble= 5.3;
        float myFloat = 4.7f;
        byte myByte = 1;
        short myShort = 120;


//        myInt = (int) myLong;
//        myInt = (int) myDouble;
//        myInt = (int) myFloat;

//        System.out.println(myInt);

//        myDouble = myByte;
//        myDouble = myShort;

//        myFloat = (float) myDouble;

//        System.out.println(myFloat);

        // ----------------------------

//        System.out.println(Math.round(myFloat));
//
//        System.out.println(Math.floor(myDouble));
//        System.out.println(Math.ceil(myDouble));

//    // --------------------------
        String myString = "5.6";

        Double aDouble = Double.valueOf(myString);

        System.out.println(aDouble);

    }
}
