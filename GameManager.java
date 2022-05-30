public interface GameManager { //інтерфейс

    void addGame(Game game);//додавати гру
    void deleteGame(String title);//видаляти гру зі списку за назвою
    void playGame(String title);//грати гру
    void showAll(); //показати всі ігри
    void searchByGenre(String genre);

    void sortByTitle();

    void searchByLetter();

}
