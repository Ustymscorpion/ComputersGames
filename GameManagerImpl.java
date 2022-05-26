import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class GameManagerImpl implements GameManager{
    private List<Game>games;//список ігор
    //колекції - динамічні структури даних


    public GameManagerImpl(){//конструктор
    games = new ArrayList<>();//створили список
    }

    @Override //@-анотація Override-перевизначити

    public void addGame(Game game){
    games.add(game);
    }

    @Override
    public void deleteGame(String title) {

    }

    @Override
    public void playGame(String title) {

    }

    @Override
    public void showAll() {
        for (int i = 0; i < games.size(); i++) {
            System.out.print((i+1) + ". ");
            System.out.println(games.get(i).getTitle());
        }
    }

    @Override
    public void searchByGenre(String genre) {
        for (int i = 0; i < games.size(); i++) {
            // equals - дорівнює
            if (games.get(i).getGenre().equals(genre)) {
                games.get(i).displayGameInfo();
            }
        }
    }


}
