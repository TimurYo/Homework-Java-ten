public class FilmsPoster {

    private int id;
    private String filmName;

    public FilmsPoster(int id,String filmName) {
        this.filmName= filmName;
        this.id= id;
    }

    public int getId() {
        return id;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setId() {
        this.id=id;
    }

    public void setFilmName() {
        this.filmName=filmName;
    }
}