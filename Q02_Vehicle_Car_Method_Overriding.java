class Vehicle {
    public void drive() { System.out.println("Vehicle is moving"); }
}
class Car extends Vehicle {
    @Override
    public void drive() { System.out.println("Repairing a car"); }
}
public class Q02_Vehicle_Car_Method_Overriding {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        vehicle.drive();
        car.drive();
    }
}
