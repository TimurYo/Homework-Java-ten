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
        test.addFilm("film 4");
        test.addFilm("film 5");
        test.addFilm("film 6");
        test.addFilm("film 7");
        test.addFilm("film 8");
        test.addFilm("film 9");
        test.addFilm("film 10");
        test.addFilm("film 11");
        test.addFilm("film 12");
        test.addFilm("film 13");
        test.addFilm("film 14");


        String[] expected = {"film 14","film 13","film 12","film 11","film 10","film 9","film 8","film 7","film 6","film 5"};
        String[] actual = test.getLastFilms();

        Assertions.assertArrayEquals(expected, actual);

    }
}
