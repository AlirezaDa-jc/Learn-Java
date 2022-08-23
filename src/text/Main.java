package text;

/**
 * Created By Alireza Dolatabadi
 * Date: 7/28/2022
 * Time: 5:52 PM
 */
public class Main {

    public static void main(String[] args) {
        String myString = "Hello";
        String myString2 = "                      World                        ";
        System.out.println(myString + myString2);
        System.out.println(myString.concat(myString2));
        System.out.println("Length : " + myString.length());
        System.out.println(myString2);
        myString2 = myString2.trim();
        System.out.println(myString2);
        String capital = "TEHRAN";
        String capitalToLower = capital.toLowerCase();
        System.out.println(capital);
        System.out.println(capitalToLower);
        String city = "LonDon";
        String cityToUpper = city.toUpperCase();
        System.out.println(city);
        System.out.println(cityToUpper);

        int index = city.indexOf("o");
        System.out.println("index of o : " + index);

        boolean lon = cityToUpper.contains("LON");
        System.out.println("contains : " + lon );

        String helloName = "Hello Alireza !!!";
        System.out.println(helloName.substring(6));

        System.out.println(helloName.endsWith("!"));

        String replace = helloName.replace("!","?");
        System.out.println(replace);

        System.out.println(helloName.equalsIgnoreCase("Hello alireza !!!"));

    }
}
