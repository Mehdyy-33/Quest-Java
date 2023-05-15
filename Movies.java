
public class Movies {
    public static void main(String[] args) {

        String[][] movies = {
            { "Indiana Jones et le Royaume du Crâne de Cristal", "Indiana Jones et la Dernière Croisade",
            "Indiana Jones et le Temple maudit" },
            { "maxime", "yann", "theo","julie", "julien", "christophe","michel", "jean", "yve" }
        };
        for (int i = 0; i < movies[0].length; i++) {
            String titles = movies[0][i];
            String actors = movies[1][i];
            System.out.println("Dans le film " + titles + ", les principaux acteurs sont : " + actors);
        }
    }

}
