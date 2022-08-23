package interfaces;

/**
 * Created By Alireza Dolatabadi
 * Date: 8/7/2022
 * Time: 2:34 PM
 */
public class Person implements ShowInfo , Work {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void showInfo() {
        System.out.println("I am " + name + " , I am " + age + " Years old");
    }

    public void walk() {
        System.out.println("I am Walking");
    }

    @Override
    public void work() {
        System.out.println("I am working");
    }
}
