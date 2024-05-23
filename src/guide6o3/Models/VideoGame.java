package guide6o3.Models;

public class VideoGame extends VideoStore {
    private Integer gameplayHours = 10;
    private String company;


    public Integer getGameplayHours() {
        return gameplayHours;
    }

    public void setGameplayHours(Integer gameplayHours) {
        this.gameplayHours = gameplayHours;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public VideoGame(String title, String genre, Integer gameplayHours, String company) {
        super(title, genre);
        this.gameplayHours = gameplayHours;
        this.company = company;
    }

    public VideoGame(String title, Integer gameplayHours) {
        super(title);
        this.gameplayHours = gameplayHours;
    }

    public VideoGame() {
    }

    @Override
    public String toString() {
        return "VideoGame{" + super.toString() +
                "gameplayHours=" + gameplayHours +
                ", company='" + company + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof VideoGame))
            throw new ClassCastException("The object isn't a VideoGame");
        else{
            if (this.getGameplayHours() < ((VideoGame)o).getGameplayHours())
                return -1;
            else if (this.getGameplayHours().equals(((VideoGame) o).getGameplayHours()))
                return 0;
            else
                return 1;
        }
    }
}
