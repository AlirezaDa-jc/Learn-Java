package stringbuilderandformat;

/**
 * Created By Alireza Dolatabadi
 * Date: 8/4/2022
 * Time: 4:07 PM
 */
public class Main {
    public static void main(String[] args) {
        String info = "info";//Immutable

        info += " site";
        info += " address";
        System.out.println(info);

        StringBuilder sb = new StringBuilder("info ");//Mutable

        sb.append("site ");
        sb.append("address ");

        System.out.println(sb.toString());

        StringBuffer sb1 = new StringBuffer("info ");//Thread Safe

        sb1.append("site ");
        sb1.append("address ");
        System.out.println(sb1.toString());

        // Formatting String

        System.out.printf("String info is : %s\n" , info);//
        System.out.printf("String info is : %S\n" , info);//to upper
        System.out.printf("String info is : %30s\n" , info);

        System.out.printf("boolean : %b\n", true);
        System.out.printf("boolean : %B\n", true);//toUpper

        System.out.printf("Float number : %100.2f\n" , 0.3);
        System.out.printf("Integer  : %d" , -5);
    }
}
