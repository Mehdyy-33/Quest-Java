class Classroom {
    public static void main(String[] args) {
        Wilder[] wilders = { new Wilder("Jean-Claude", false), new Wilder("Henri", true) };

        for (Wilder wilder : wilders) {
            System.out.println(wilder.whoAmI());
        }
    }
}
