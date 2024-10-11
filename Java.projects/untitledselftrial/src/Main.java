// Class definition
class Car {
    // Fields (Attributes)
    String model;
    String color;
    int year;

    // Constructor (Special method to initialize objects)
    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Method (Behavior)
    public void drive() {
        System.out.println(model + " is driving.");
    }
}