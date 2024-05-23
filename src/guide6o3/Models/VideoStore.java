package guide6o3.Models;

import java.util.Comparator;

public abstract class VideoStore implements Comparable<Object> {
    private String title;
    private Boolean delivered = false;
    private String genre;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public VideoStore(String title) {
        this.title = title;
    }

    public VideoStore(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public VideoStore() {
    }

    public Boolean deliver() {
        if (this.delivered.equals(false)) {
            this.delivered = true;
            return true;
        } else
            return false;
    }

    public Boolean getBack() {
        if (this.delivered.equals(true)) {
            this.delivered = false;
            return true;
        } else
            return false;
    }

    public Boolean isDelivered() {
        return this.delivered;
    }

    @Override
    public String toString() {
        return  "title='" + title + '\'' +
                ", delivered=" + delivered +
                ", genre='" + genre + '\'' ;

    }
}
