public class FilmManager {
    private FilmRepository repo;
    private int limit;

    public FilmManager(FilmRepository repo, int limit) {
        this.repo = repo;
        this.limit = limit;
    }

    public FilmManager(FilmRepository repo) {
        this.limit = 10;
        this.repo = repo;
    }


    public FilmsPoster[] getLastFilms() {
        FilmsPoster[] all = repo.findAll();

        int lastTenFilmsLength;

        if (all.length < limit) {
            lastTenFilmsLength = all.length;
        } else {
            lastTenFilmsLength = limit;
        }

        FilmsPoster[] lastTenFilms = new FilmsPoster[lastTenFilmsLength];
        for (int i = 0; i < lastTenFilms.length; i++) {
            lastTenFilms[i] = all[all.length - 1 - i];
        }

        return lastTenFilms;
    }

}
