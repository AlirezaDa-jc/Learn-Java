package encapsulation;

/**
 * Created By Alireza Dolatabadi
 * Date: 8/8/2022
 * Time: 5:02 PM
 */
public class Fruit {
    public static final int ID = 7;//constant Snake Case Upper

    private String color;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String grow() {
        return "grow " + calculate();
    }

    private int calculate(){
        return 5;
    }
}
