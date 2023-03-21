import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
//    FilmManager film1 = new FilmManager("Lord of the Rings");
//    FilmManager film2 = new FilmManager("Avatar");
//    FilmManager film3 = new FilmManager("Founder");

    @Test
    public void filmManagerTest() {
        FilmManager test = new FilmManager();
        test.addFilm("Lord of the Rings");
        test.addFilm("Avatar");
        test.addFilm("Founder");


        String[] expected = {"Lord of the Rings", "Avatar", "Founder"};
        String[] actual = test.getAllFilms();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void filmManagerLastTenTestWithoutParam() {
        FilmManager test = new FilmManager();
        test.addFilm("Lord of the Rings");
        test.addFilm("Avatar");
        test.addFilm("Founder");


        String[] expected = {"Founder", "Avatar", "Lord of the Rings"};
        String[] actual = test.getLastFilms();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void filmManagerLastTenTestWithParam() {
        FilmManager test = new FilmManager(10);
        test.addFilm("Lord of the Rings");
        test.addFilm("Avatar");
        test.addFilm("Founder");


        String[] expected = {"Founder", "Avatar", "Lord of the Rings"};
        String[] actual = test.getLastFilms();

        Assertions.assertArrayEquals(expected, actual);

    }
}
