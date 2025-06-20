// Class definition
class Car {
    String model;
    int speed;

    void accelerate() {
        speed += 10;
        System.out.println(model + " is now going " + speed + " km/h.");
    }
}

// Creating objects
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();  // Object creation
        myCar.model = "Toyota";
        myCar.speed = 50;
        myCar.accelerate();  // Uses the method from the class
    }
}
