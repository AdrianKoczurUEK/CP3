import java.util.ArrayList;
class Library{
    ArrayList<Book> collection;

    Library(ArrayList<Book> books){
        collection = new ArrayList<Book>();
        for(Book book: books){
            addBook(book);
        }
    }

    Library(Book book){
        collection = new ArrayList<Book>();
        addBook(book);
    }
    
    void addBook(Book book){
        collection.add(book);
    }
}