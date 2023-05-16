class Hangar {

    public static void main(String[] args) {

        Vehicule[] vehicules = { new Car("Clio", 0), new Boat("Titanic", 0) };

        for (Vehicule vehicule : vehicules) {
            System.out.println(vehicule.doStuff());
        }
    }
}