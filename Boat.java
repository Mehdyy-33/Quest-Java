public class Boat extends Vehicule {

    // constructor
    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }

    // methods
    @Override
    public String doStuff() {
        return "Je suis " + getBrand() + " et je fais glou glou !";
    }
}