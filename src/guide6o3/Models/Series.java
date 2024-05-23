package guide6o3.Models;

public class Series extends VideoStore {
    private Integer seasons = 3;
    private String creator;

    public void setSeasons(Integer seasons) {
        this.seasons = seasons;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Integer getSeasons() {
        return seasons;
    }

    public String getCreator() {
        return creator;
    }

    public Series(String title, String genre, Integer seasons, String creator) {
        super(title, genre);
        this.seasons = seasons;
        this.creator = creator;
    }

    public Series(String title, Integer seasons) {
        super(title);
        this.seasons = seasons;
    }

    public Series() {
    }

    @Override
    public String toString() {
        return "Series{" + super.toString() +
                "seasons=" + seasons +
                ", creator='" + creator + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Series))
            throw new ClassCastException("The object isn't a Series");
        else{
            if (this.getSeasons() < ((Series)o).getSeasons())
                return -1;
            else if (this.getSeasons().equals(((Series) o).getSeasons()))
                return 0;
            else
                return 1;
        }
    }



}
