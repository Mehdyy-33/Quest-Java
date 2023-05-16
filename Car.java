public class Car extends Vehicule {

    // constructor
    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    // methods
    @Override
    public String doStuff() {
        return "Je suis " + getBrand() + " et je fais vroum vroum !";
    }
}