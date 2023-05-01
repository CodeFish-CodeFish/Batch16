package inheritance.inheritancePractice4;

public class Book {
    String title;
   public static int pageNumber;

    public Book(String title, int pageNumber){
        this.pageNumber =pageNumber;
        this.title= title;
    }

    public static int getPageNumber(){
        System.out.println("=====");
        return pageNumber;
    }


}
