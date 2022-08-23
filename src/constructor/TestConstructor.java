package constructor;

/**
 * Created By Alireza Dolatabadi
 * Date: 8/4/2022
 * Time: 2:04 PM
 */
class Person {
    private String name;
    private int age;
    //default constructor
//    public Person(){
//
//    }

    public Person() {
        System.out.println("In Constructor");
    }

    public Person(String name) {
        this();
        System.out.println("In Second Constructor");
        this.name = name;

    }
    //Constructor Nesting
    public Person(String name, int age) {
        this(name);
        System.out.println("In Third Constructor");
        this.age = age;
    }

    public Person(String name , int a , int b){
        System.out.println("In Fourth Constructor");
        this.name = name;
        this.age = a+b;
    }
}

public class TestConstructor {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person("Alireza");
        Person person2 = new Person("A" , 15);
        Person person3 = new Person("A" , 15 , 17);
    }
}
