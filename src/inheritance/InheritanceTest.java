package inheritance;

/**
 * Created By Alireza Dolatabadi
 * Date: 8/6/2022
 * Time: 2:47 PM
 */
class Vehicle {
    String color;
    int maxSpeed;

    public void move() {
        System.out.println("I am moving");
    }

    public void describe(){
        System.out.println("I am " + color + " and my max speed is " + maxSpeed);
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("I am driving");
    }
}

class Train extends Vehicle {

}

public class InheritanceTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
//        Vehicle vehicle = new Vehicle();
//        vehicle.move();
//        Train train = new Train();
//        train.color = "Yellow";
//        train.maxSpeed = 90;
//        train.move();
//        train.describe();
    }
}
