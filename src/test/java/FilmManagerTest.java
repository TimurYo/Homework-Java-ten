import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class FilmManagerTest {
    FilmsPoster film1 = new FilmsPoster(525,"film 1");
    FilmsPoster film2 = new FilmsPoster(527,"film 2");
    FilmsPoster film3 = new FilmsPoster(529,"film 3");
    FilmsPoster film4 = new FilmsPoster(530,"film 4");
    FilmsPoster film5 = new FilmsPoster(531,"film 5");
    FilmsPoster film6 = new FilmsPoster(532,"film 6");
    FilmsPoster film7 = new FilmsPoster(533,"film 7");
    FilmsPoster film8 = new FilmsPoster(534,"film 8");
    FilmsPoster film9 = new FilmsPoster(535,"film 9");
    FilmsPoster film10 = new FilmsPoster(536,"film 10");
    FilmsPoster film11 = new FilmsPoster(537,"film 11");
    FilmsPoster film12 = new FilmsPoster(538,"film 12");
    FilmsPoster film13 = new FilmsPoster(539,"film 13");
    FilmsPoster film14 = new FilmsPoster(540,"film 14");

    FilmRepository repo = Mockito.mock(FilmRepository.class);
    FilmManager manager2 = new FilmManager(repo,10);
    FilmManager manager1 = new FilmManager(repo);

    @Test
    public void saveAndFindAllTest() {
        FilmRepository repo = new FilmRepository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);

        FilmsPoster[] expected = {film1,film2,film3};
        FilmsPoster[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findByIdTest() {
        FilmRepository repo= new FilmRepository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);

        repo.findById(film2.getId());

        FilmsPoster[] expected = {film2};
        FilmsPoster[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeByIdTest() {
        FilmRepository repo= new FilmRepository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.removeById(film2.getId());

        FilmsPoster[] expected = {film1,film3};
        FilmsPoster[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void removeAll() {
        FilmRepository repo = new FilmRepository();
        repo.save(film1);
        repo.save(film2);
        repo.save(film3);
        repo.removeAll();

        FilmsPoster[] expected = {};
        FilmsPoster[] actual = repo.findAll();
    }

    @Test
    public void filmManagerLastTenTestWithoutParam() {
//        manager1.save(film1);
//        manager1.save(film2);
//        manager1.save(film3);

        FilmsPoster[] films = {film1,film2,film3};
        doReturn(films).when(repo).findAll();


        FilmsPoster[] expected = {film3,film2,film1};
        FilmsPoster[] actual = manager1.getLastFilms();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void filmManagerLastTenTestWithParam() {
//        manager2.save(film1);
//        manager2.save(film2);
//        manager2.save(film3);
//        manager2.save(film4);
//        manager2.save(film5);
//        manager2.save(film6);
//        manager2.save(film7);
//        manager2.save(film8);
//        manager2.save(film9);
//        manager2.save(film10);
//        manager2.save(film11);
//        manager2.save(film12);
//        manager2.save(film13);
//        manager2.save(film14); 

        FilmsPoster[] films = {film1,film2,film3,film4,film5,film6,film7,film8,film9,film10,film11,film12,film13,film14};
        doReturn(films).when(repo).findAll();


        FilmsPoster[] expected = {film14, film13,film12,film11,film10,film9,film8,film7,film6,film5};
        FilmsPoster[] actual = manager2.getLastFilms();

        Assertions.assertArrayEquals(expected, actual);

    }
}
