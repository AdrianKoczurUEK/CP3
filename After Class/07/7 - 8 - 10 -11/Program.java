import java.util.ArrayList;
class Program{
    public static void main(String[] args) {
        
        Writer w1 = new Writer("Adrian","Nowak",42);
        Writer w2 = new Writer("Kamil","Stachowicz",35);
        Book b1 = new Book(w1,"Fantasy","Andromeda");
        Book b2 = new Book(w2,"Sci-Fi","Kasztan in space");
        Book b3 = new Book(w1,"Komedy","The small D");
        
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        Bookcase bookcase = new Bookcase(books);
        System.out.println(bookcase);

        Book b4 = new Book(w1,"Drama","The School");
        b4.addChapter("First Chapter", 50, 1);
        b4.addChapter("Second Chapter", 60, 51);
        for(Chapters chapter: b4.getChapters()){
            System.out.println(chapter);
        }
        b4.removeChapter("First Chapter");
        

    }



}
