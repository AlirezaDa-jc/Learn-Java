package tostring;

/**
 * Created By Alireza Dolatabadi
 * Date: 8/6/2022
 * Time: 1:32 PM
 */
class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Hello");
//        return "Name : " + name + '\n' +
//                "Age : " + age;
//        return sb.toString();
//    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ToStringTest {
    public static void main(String[] args) {
        Object obj = new Object();
//        System.out.println(obj.toString());

        Person person = new Person("Alireza", 21);
        System.out.println(person.toString());

    }
}
