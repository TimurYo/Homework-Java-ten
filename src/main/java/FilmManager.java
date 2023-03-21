public class FilmManager {
    private String[] films = new String[0];
    private int limit;

    public FilmManager() {
        this.limit = 10;
    }

    public FilmManager(int limit) {
        this.limit = limit;

    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] getAllFilms() {
        return films;
    }

    public String[] getLastFilms() {
        int lastTenFilmsLength;
        if (films.length < limit) {
            lastTenFilmsLength = films.length;
        } else {
            lastTenFilmsLength = limit;
        }
        String[] lastTenFilms = new String[lastTenFilmsLength];
        for (int i = 0; i < lastTenFilms.length; i++) {
            lastTenFilms[i] = films[films.length - 1 - i];
        }
        return lastTenFilms;
    }

}
