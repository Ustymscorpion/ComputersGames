public class Game {
    String title;
    int year;
    String genre;

  /*
     гетер для поля title
     get - отримувати
     camelCase - getTitle
  */

    public String getTitle(){
        return title;
    }

    public int getYear(){
        return year;
    }

    public String getGenre(){
        return genre;
    }

  /*
    сетери для поля title
    set - встановлювати
  */

    public void setTitle(String title){
        this.title = title;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void displayGameInfo(){
        System.out.println(this.title + " was released in " + this.year);
    }

}
