import java.util.ArrayList;
class Program{
    public static void main(String[] args) {
		Publisher p1 = new Publisher("DOLBY", "KANZAS");
		Writer w1 = new Writer("Adam", "Palka","Comedy");
		Writer w2 = new Writer("Krystian", "Baka","Horror");
        Book b1 = new Book("Kalamendaros", w1,p1,1998);
		b1.display();
		Ebook e1 = new Ebook("Ebooker",w2,"hehe.JPG",p1,2012);
		e1.display();
		AudioBook ab1 = new AudioBook("Bet-Howen",w1,56,p1,2021);
		ab1.display();
		ArrayList<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(e1);
		books.add(ab1);
		System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvv");
		System.out.println("vvvv LIBRARY CONTENT vvvv");
		for(Book book: books){
			book.display();
		}
    }
}