public class FilmRepository {
    private FilmsPoster[] films = new FilmsPoster[0];


    public void save(FilmsPoster film) {
        FilmsPoster[] tmp = new FilmsPoster[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public FilmsPoster[] findAll() {
        return films;
    }

    public void findById (int id) {
        FilmsPoster[] tmp = new FilmsPoster[1];
        int copyToIndex=0;

        for (FilmsPoster film: films) {
            if(film.getId() == id){
                tmp[copyToIndex] = film;
                copyToIndex++;
            }
        }
        films=tmp;
    }

    public void removeById(int id) {
        FilmsPoster[] tmp = new FilmsPoster[films.length - 1];
        int copyToIndex = 0;
        for (FilmsPoster film : films) {
            if (film.getId() != id) {
                tmp[copyToIndex] = film;
                copyToIndex++;
            }
        }
        films=tmp;

    }
    public void removeAll() {
        FilmsPoster[] tmp = new FilmsPoster[0];
        films=tmp;
    }

}
