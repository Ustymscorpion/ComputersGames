public class Game {
   private String title;
   private int year;
   private String genre;

   private String price;

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

    public String getPrice() { return price; }

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

    public void setPrice(String price) { this.price = price; }
    public void displayGameInfo(){
        System.out.println(this.title + " was released in " + this.year + " the game price is " + this.price);
    }

}
