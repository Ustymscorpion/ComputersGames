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
     game2.setPrice(" 899 UAH");

      Game game3 = new Game();
      game3.setTitle("S.T.A.L.K.E.R. Shadow of Chernobyl");
      game3.setYear(2007);
      game3.setGenre("First-person shooter");//, role game, Survival horror");
      game3.setPrice("279 UAH");

       Game game4 = new Game();
       game4.setTitle("S.T.A.L.K.E.R. Clear Sky");
       game4.setYear(2008);
       game4.setGenre("First-person shooter");//, role game, Survival horror");
       game4.setPrice("169 UAH");

        Game game5 = new Game();
        game5.setTitle("S.T.A.L.K.E.R.: Call of Pripyat");
        game5.setYear(2009);
        game5.setGenre("First-person shooter");//, role game, Survival horror");
        game5.setPrice("279 UAH");

         Game game6 = new Game();
         game6.setTitle("Metro 2033 / Metro 2033 Redux");
         game6.setYear(2006 / 2014);
         game6.setGenre("First-person shooter");//, role game,stealth, survival horror");
         game6.setPrice(" - / 279 UAH");

          Game game7 = new Game();
          game7.setTitle("Metro: Last Light / Metro: Last Light Redux");
          game7.setYear(2013 / 2014);
          game7.setGenre("First-person_shooter");//, role game, stealth, survival_horror");
          game7.setPrice(" - / 279 UAH");

           Game game8 = new Game();
           game8.setTitle("Metro Exodus");
           game8.setYear(2019);
           game8.setGenre("First-person shooter");//, role game, adventure video game, open world, linearity");
           game8.setPrice("506 UAH");

            Game game9 = new Game();
            game9.setTitle("Ostriv");
            game9.setYear(2020);//2016-анонс 2020-випуск
            game9.setGenre("Urban Simulator");//, Strategy Video, Indie Games, Early Access, Simulation, Strategy");
            game9.setPrice("329 UAH");

             Game game10 = new Game();
             game10.setTitle("Beat Saber");
             game10.setYear(2019);
             game10.setGenre("VR");
             game10.setPrice("379 UAH");

             Game game11 = new Game();
             game11.setTitle("Boneworks");
             game11.setYear(2019);
             game11.setGenre("VR");
             game11.setPrice("379 UAH");

             Game game12 = new Game();
             game12.setTitle("Half-Life: Alyx");
             game12.setYear(2020);
             game12.setGenre("VR");
             game12.setPrice("699 UAH");

             Game game13 = new Game();
             game13.setTitle("Shores of Loci");
             game13.setYear(2022);
             game13.setGenre("VR");
             game13.setPrice("229 UAH");


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
        gameManager.addGame(game10);
        gameManager.addGame(game11);
        gameManager.addGame(game12);
        gameManager.addGame(game13);
        gameManager.showAll();

        System.out.println("");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number (fot 1 to 13): ");
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
        if (num==10){
           game10.displayGameInfo();
        }
        if (num==11){
           game11.displayGameInfo();
        }
        if (num==12){
         game12.displayGameInfo();
        }
        if (num==13){
         game13.displayGameInfo();
        }

        else{
         System.out.println("ERROR. We haven't this game");
        }

     sc.nextLine();
     System.out.println("Genres: Action role game, sandbox, First-person shooter, VR");
     System.out.println("Enter genre: ");
     String genre = sc.nextLine();
     gameManager.searchByGenre(genre);

  }

}
