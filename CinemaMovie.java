import java.util.*;

class CinemaMovie {
    int id;
    String movie;
    String description;
    double rating;

    CinemaMovie(int id, String movie, String description, double rating) {
        this.id = id;
        this.movie = movie;
        this.description = description;
        this.rating = rating;
    }
}

public class Main {
    public static void main(String[] args) {

        List<CinemaMovie> movies = new ArrayList<>();

        movies.add(new CinemaMovie(1, "War", "great 3D", 8.9));
        movies.add(new CinemaMovie(2, "Science", "fiction", 8.5));
        movies.add(new CinemaMovie(3, "irish", "boring", 6.2));
        movies.add(new CinemaMovie(4, "Ice song", "Fantacy", 8.6));
        movies.add(new CinemaMovie(5, "House card", "Interesting", 9.1));

        List<CinemaMovie> result = new ArrayList<>();

        // filter odd id and description not boring
        for (CinemaMovie m : movies) {
            if (m.id % 2 == 1 && !m.description.equalsIgnoreCase("boring")) {
                result.add(m);
            }
        }

        // sort by rating descending
        Collections.sort(result, (a, b) -> Double.compare(b.rating, a.rating));

        // print result
        for (CinemaMovie m : result) {
            System.out.println(m.id + " " + m.movie + " " + m.description + " " + m.rating);
        }
    }
}
