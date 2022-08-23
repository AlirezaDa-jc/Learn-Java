package casting;

/**
 * Created By Alireza Dolatabadi
 * Date: 8/8/2022
 * Time: 7:28 PM
 */
public class UpcastAndDowncast {
    public static void main(String[] args) {

//        Vehicle vehicle = new Vehicle();
//        vehicle.start();
//        Car car = new Car();
//        car.start();
//        car.drive();

        //upcasting
//        Vehicle vehicle = new Car();
//        vehicle = car;
//        vehicle.start();
        // error : vehicle.drive();

        //downcasting
        Vehicle vehicle = new Car();
        Car car = (Car) vehicle;
        car.drive();
        car.start();

//ClassCastException -- RuntimeError
/*        Vehicle vehicle = new Vehicle();
        Car car = (Car) vehicle;
        car.drive();
        car.start();*/


    }
}
