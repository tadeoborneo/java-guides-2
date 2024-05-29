package guide6o3;

import guide6o3.Models.Series;
import guide6o3.Models.VideoGame;
import guide6o3.Models.VideoStore;

import java.util.*;

public class MainGuide6o3 {
    public static void main(String[] args) {

        Series series1 = new Series("Breaking Bad", "Crime, Drama, Thriller", 5, "Vince Gilligan");
        Series series2 = new Series("Stranger Things", "Drama, Fantasy, Horror", 4, "The Duffer Brothers");
        Series series3 = new Series("Game of Thrones", "Action, Adventure, Drama", 8, "David Benioff, D.B. Weiss");
        Series series4 = new Series("The Office", "Comedy", 9, "Greg Daniels");
        Series series5 = new Series("Friends", "Comedy, Romance", 10, "David Crane, Marta Kauffman");

        VideoGame game1 = new VideoGame("The Legend of Zelda: Breath of the Wild", "Action-adventure", 50, "Nintendo");
        VideoGame game2 = new VideoGame("The Witcher 3: Wild Hunt", "Action RPG", 70, "CD Projekt");
        VideoGame game3 = new VideoGame("Minecraft", "Sandbox, Survival", 100, "Mojang");
        VideoGame game4 = new VideoGame("Red Dead Redemption 2", "Action-adventure", 60, "Rockstar Games");
        VideoGame game5 = new VideoGame("God of War", "Action-adventure", 40, "Santa Monica Studio");

        List<Series> seriesList = Arrays.asList(series1,series2,series3,series4,series5);
        List<VideoGame> videoGameList = Arrays.asList(game1,game2,game3,game4,game5);

        series1.deliver();
        series5.deliver();

        game1.deliver();
        game5.deliver();

        System.out.println(seriesList);
        System.out.println(videoGameList + "\n");
        List<VideoGame> deliveredGames = new ArrayList<>();
        VideoGame mostGameplayHours = videoGameList.getFirst();
        for(VideoGame v : videoGameList) {
            if (v.isDelivered())
                deliveredGames.add(v);
            if (v.getGameplayHours() > mostGameplayHours.getGameplayHours())
                mostGameplayHours = v;
        }

        List<Series> deliveredSeries = new ArrayList<>();
        Series mostSeasons = seriesList.getFirst();
        for(Series s : seriesList) {
            if (s.isDelivered())
                deliveredSeries.add(s);
            if(s.getSeasons() > mostSeasons.getSeasons())
                mostSeasons = s;
        }
        System.out.println("Delivered games: "+ deliveredGames.size() + " " + deliveredGames);
        System.out.println("Delivered series: "+ deliveredSeries.size() + " " + deliveredSeries);

        System.out.println("Most season series: " + mostSeasons);
        System.out.println("Most gameplay hours game: "+ mostGameplayHours);
    }
}
