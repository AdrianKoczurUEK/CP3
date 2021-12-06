import java.util.ArrayList;
public class Bookcase {
    
    private ArrayList<Book> books;

    Bookcase(ArrayList<Book> bookies){
        books = new ArrayList<Book>();
        for(Book book: bookies){
            addBook(book);
        }
    }

    Bookcase(Book book){
        books = new ArrayList<Book>();
        addBook(book);
    }
    
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
    public ArrayList<Book> getBooks() {
        return books;
    }

    void addBook(Book book){
        this.books.add(book);
    }

    void removeBook(Book book){
        this.books.remove(book);
    }

    public String toString(){
        String text="";

        for(Book book: books){
            text+=book + "\n";
        }
        return text;
    }
}
