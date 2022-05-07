import java.util.Scanner;

public class Game_Store {
    public static void main(String[] args){

    Game game1 = new Game();
    // створення об'єкту класу Game. game1 - об'єкт
    game1.setTitle("Minecraft");
    game1.setYear(2009);
    game1.setGenre("Sandbox, survival");


     Game game2 = new Game();
     game2.setTitle("Cyberpunk 2077");
     game2.setYear(2020);
     game2.setGenre("Action role-playing");


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if ( num==1 ) {
            game1.displayGameInfo();
        }


    }
}
