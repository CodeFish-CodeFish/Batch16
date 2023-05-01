package inheritance.inheritancePractice4;

public class NoteBook extends Book {

    public NoteBook() {
        super("JAVA", 200);
    }


    public static int getPageNumber(){
        System.out.println("*****");
        return pageNumber;
    }


    public static void main(String[] args) {

        Book book = new Book("*JAVA*", 300);
        System.out.println( book.pageNumber ); //

        NoteBook noteBook = new NoteBook();


        System.out.println( noteBook.pageNumber );
        noteBook.pageNumber = 100;
        System.out.println(noteBook.pageNumber);

        System.out.println("============");
        System.out.println(  book.getPageNumber()   ); // 100

        System.out.println( noteBook.getPageNumber() ); // 100
    }





}

