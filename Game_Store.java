import java.util.Scanner;

public class Game_Store {

  public static void main(String[] args) {

      Game game1 = new Game();
      // створення об'єкту класу Game. game1 - об'єкт
      game1.setTitle("Minecraft");
      game1.setYear(2009);
      game1.setGenre("sandbox");//, survival");
      game1.setPrice(" 23,95 € ");

      Game game2 = new Game();
      game2.setTitle("Cyberpunk 2077");
      game2.setYear(2020);
      game2.setGenre("Action role game");
      game2.setPrice(" 899 UAH / 59,99 € ");

   /*stalker*/ Game game3 = new Game();
               game3.setTitle("S.T.A.L.K.E.R. Shadow of Chernobyl");
               game3.setYear(2007);
               game3.setGenre("First-person shooter");//, role game, Survival horror");
               game3.setPrice("279 UAH / 15,99 € ");
               //
               Game game4 = new Game();
               game4.setTitle("S.T.A.L.K.E.R. Clear Sky");
               game4.setYear(2008);
               game4.setGenre("First-person shooter");//, role game, Survival horror");
               game4.setPrice("169 UAH / 9,99 € ");
               //
               Game game5 = new Game();
               game5.setTitle("S.T.A.L.K.E.R.: Call of Pripyat");
               game5.setYear(2009);
               game5.setGenre("First-person shooter");//, role game, Survival horror");
               game5.setPrice("279 UAH / 19,99 € ");

   /*Metro*/ Game game6 = new Game();
             game6.setTitle("Metro 2033 / Metro 2033 Redux");
             game6.setYear(2006 / 2014);
             game6.setGenre("First-person shooter");//, role game,stealth, survival horror");
             game6.setPrice(" - / 279 UAH | - / 19,99 € ");
             //
             Game game7 = new Game();
             game7.setTitle("Metro: Last Light / Metro: Last Light Redux");
             game7.setYear(2013 / 2014);
             game7.setGenre("First-person_shooter");//, role game, stealth, survival_horror");
             game7.setPrice(" - / 279 UAH | - / 19,99 € ");
             //
             Game game8 = new Game();
            game8.setTitle("Metro Exodus");
            game8.setYear(2019);
            game8.setGenre("First-person shooter");//, role game, adventure video game, open world, linearity");
            game8.setPrice("506 UAH / 29,99 € ");

            Game game9 = new Game();
            game9.setTitle("Ostriv");
            game9.setYear(2020);//2016-анонс 2020-випуск
            game9.setGenre("Urban Simulator");//, Strategy Video, Indie Games, Early Access, Simulation, Strategy");
            game9.setPrice("329 UAH / 20,99 € ");

            Game game10 = new Game();
            game10.setTitle("Counter-Strike: Global Offensive");
            game10.setYear(2013);
            game10.setGenre("First-person shooter");
            game10.setPrice("Free to play");

   /*VR*/    Game game11 = new Game();
             game11.setTitle("Beat Saber");
             game11.setYear(2019);
             game11.setGenre("VR");
             game11.setPrice("379 UAH / 29,99 € ");

             Game game12 = new Game();
             game12.setTitle("Boneworks");
             game12.setYear(2019);
             game12.setGenre("VR");
             game12.setPrice("379 UAH / 24,99 € ");

             Game game13 = new Game();
             game13.setTitle("Half-Life: Alyx"); // λ
             game13.setYear(2020);
             game13.setGenre("VR");
             game13.setPrice("699 UAH / 49,99 € ");

             Game game14 = new Game();
             game14.setTitle("Shores of Loci");
             game14.setYear(2022);
             game14.setGenre("VR");
             game14.setPrice("229 UAH / 12,49 € ");

             Game game15 = new Game();
             game15.setTitle("Job Simulator");
             game15.setYear(2016);
             game15.setGenre("VR");
             game15.setPrice("279 UAH / 19,99 € ");

   /*GTA*/    Game game16 = new Game();
              game16.setTitle("GTA");
              game16.setYear(1997);
              game16.setGenre("Third-person shooter");
              game16.setPrice("");

              Game game17 = new Game();
              game17.setTitle("GTA II");
              game17.setYear(1999);
              game17.setGenre("Third-person shooter");
              game17.setPrice("");

              Game game18 = new Game();
              game18.setTitle("GTA: Vice City");
              game18.setYear(2002);
              game18.setGenre("Third-person shooter");
              game18.setPrice("");

              Game game19 = new Game();
              game19.setTitle("GTA: San Andreas");
              game19.setYear(2004);
              game19.setGenre("Third-person shooter");
              game19.setPrice("");

              Game game20 = new Game();
              game20.setTitle("GTA IV");
              game20.setYear(2008);
              game20.setGenre("Third-person shooter");
              game20.setPrice("TCE: 429 UAH / 19,99 € "); //price of The Complete Edition !!!

              Game game21 = new Game();
              game21.setTitle("GTA V");
              game21.setYear(2013);
              game21.setGenre("Third-person shooter");
              game21.setPrice("SE: 484 UAH / 25,29 € PE: 629 UAH / 29,98 € "); // PE = Premium Edition  SE = Standart Edition!!!

              Game game22 = new Game();
              game22.setTitle("GTA: The Trilogy");
              game22.setYear(2021);
              game22.setGenre("Third-person shooter");
              game22.setPrice("");

    /*Portal*/ Game game23 = new Game();
               game23.setTitle("Portal");
               game23.setYear(2007);
               game23.setGenre("brain teaser");
               game23.setPrice("169 UAH / 8,19 € ");

               Game game24 = new Game();
               game24.setTitle("Portal 2");
               game24.setYear(2011);
               game24.setGenre("brain teaser");
               game24.setPrice("169 UAH / 8,19 € ");

               Game game25  = new Game();

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
        gameManager.addGame(game14);
        gameManager.addGame(game15);
        gameManager.addGame(game16);
        gameManager.addGame(game17);
        gameManager.addGame(game18);
        gameManager.addGame(game19);
        gameManager.addGame(game20);
        gameManager.addGame(game21);
        gameManager.addGame(game22);
        gameManager.addGame(game23);
        gameManager.addGame(game24);

        gameManager.showAll();

        System.out.println("");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number (fot 1 to 24): ");
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
        if (num==14){
         game14.displayGameInfo();
        }
        if (num==15){
         game15.displayGameInfo();
        }

        else{
         System.out.println("ERROR. We haven't this game");
        }

     sc.nextLine();
     System.out.println("Genres: Action role game, sandbox, First-person shooter, VR, Third-person shooter");
     System.out.println("Enter genre: ");
     String genre = sc.nextLine();
     gameManager.searchByGenre(genre);
      System.out.println("");
     gameManager.sortByTitle();
     gameManager.showAll();
     gameManager.deleteGame("Cyberpunk 2077");
      System.out.println("");
     gameManager.showAll();
  }

}


