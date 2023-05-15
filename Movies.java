import java.util.Arrays;

public class Movies {
    public static void main(String[] args) {
        String[] movie = { "Indiana Jones et le Royaume du Crâne de Cristal", "Indiana Jones et la Dernière Croisade",
                "Indiana Jones et le Temple maudit" };
        String[] actor1 = { "michel", "jean", "yve" };
        String[] actor2 = { "julie", "julien", "christophe" };
        String[] actor3 = { "maxime", "yann", "theo" };
        String[][] movies;

        movies = new String[][] {
                movie,
                actor1,
                actor2,
                actor3,
        };
        System.out.println(Arrays.toString(movies[0]));
        System.out.println(Arrays.toString(movies[1]));
        System.out.println(Arrays.toString(movies[2]));
    }

}
