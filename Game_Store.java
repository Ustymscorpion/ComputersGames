import java.util.Scanner;

public class Game_Store {
    public static void main(String[] args){

    Game game1 = new Game();
    // створення об'єкту класу Game. game1 - об'єкт
    game1.setTitle("Minecraft");
    game1.setYear(2009);
    game1.setGenre("sandbox");//, survival");

     Game game2 = new Game();
     game2.setTitle("Cyberpunk 2077");
     game2.setYear(2020);
     game2.setGenre("Action role game");

      Game game3 = new Game();
      game3.setTitle("S.T.A.L.K.E.R. Shadow of Chernobyl");
      game3.setYear(2007);
      game3.setGenre("First-person shooter");//, role game, Survival horror");

       Game game4 = new Game();
       game4.setTitle("S.T.A.L.K.E.R. Clear Sky");
       game4.setYear(2008);
       game4.setGenre("First-person shooter");//, role game, Survival horror");

        Game game5 = new Game();
        game5.setTitle("S.T.A.L.K.E.R.: Call of Pripyat");
        game5.setYear(2009);
        game5.setGenre("First-person shooter");//, role game, Survival horror");

         Game game6 = new Game();
         game6.setTitle("Metro 2033 / Metro 2033 Redux");
         game6.setYear(2006 / 2014);
         game6.setGenre("First-person shooter");//, role game,stealth, survival horror");

          Game game7 = new Game();
          game7.setTitle("Metro: Last Light / Metro: Last Light Redux");
          game7.setYear(2013 / 2014);
          game7.setGenre("First-person_shooter");//, role game, stealth, survival_horror");

           Game game8 = new Game();
           game8.setTitle("Metro Exodus");
           game8.setYear(2019);
           game8.setGenre("First-person shooter");//, role game, adventure video game, open world, linearity");

            Game game9 = new Game();
            game9.setTitle("Ostriv");
            game9.setYear(2016/2020);//2016-анонс 2020-випуск
            game9.setGenre("Urban Simulator");//, Strategy Video, Indie Games, Early Access, Simulation, Strategy");


        GameManagerImpl gameManager = new GameManagerImpl();
        gameManager.addGame(game1);
        gameManager.addGame(game2);
        gameManager.addGame(game3);
        gameManager.addGame(game4);
        gameManager.addGame(game5);
        gameManager.addGame(game6);
        gameManager.addGame(game7);
        gameManager.addGame(game8);
        gameManager.addGame(game9);
        gameManager.showAll();

        System.out.println("");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number (fot 1 to 9): ");
        int num = sc.nextInt();
        if ( num==1 ) {
            game1.displayGameInfo();
        }
        if  (num==2) {
            game2.displayGameInfo();
        }
        if (num==3){
            game3.displayGameInfo();
        }
        if (num==4){
            game4.displayGameInfo();
        }
        if (num==5){
            game5.displayGameInfo();
        }
        if (num==6){
            game6.displayGameInfo();
        }
        if (num==7){
            game7.displayGameInfo();
        }
        if (num==8){
            game8.displayGameInfo();
        }
        if (num==9){
            game9.displayGameInfo();
        }
     sc.nextLine();
     System.out.println("Genres: Action role game, sandbox, First-person shooter");
     System.out.println("Enter genre: ");
     String genre = sc.nextLine();
     gameManager.searchByGenre(genre);

    }

}
