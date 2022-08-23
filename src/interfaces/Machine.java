package interfaces;

/**
 * Created By Alireza Dolatabadi
 * Date: 8/7/2022
 * Time: 2:34 PM
 */
public class Machine implements ShowInfo {
    private String name;
    private String country;

    public Machine(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public void showInfo() {
        System.out.println("I am " + name  + " I am from " + country);
    }
}
