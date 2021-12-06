import java.util.ArrayList;
public class Book {
    
    private String title;
    private String genre;
    private Writer writer;
    private ArrayList<Chapters> chapters;

    Book(Writer writer,String genre, String title){
        chapters= new ArrayList<Chapters>();
        setWriter(writer);
        setGenre(genre);
        setTitle(title);

    }

    public ArrayList<Chapters> getChapters() {
        return chapters;
    }

    void addChapter(String title, int pages, int staringPage){
        this.chapters.add(new Chapters(title, pages, staringPage));
    }

    void removeChapter(String title){
        int id=-1;
        for(Chapters chapter: chapters){
            if(chapter.getChapterTitle().equals(title)){
                id=chapters.indexOf(chapter);
            }
        }
        if(id!=-1){
            System.out.println("Chapter "+chapters.get(id).getChapterTitle()+" has been deleted!");
            chapters.remove(id);  
        }
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }
   
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public Writer getWriter() {
        return writer;
    }

    void open(){
        System.out.println("The book is open");
    }

    void close(){
        System.out.println("The Book is closed");
    }

    public String toString(){
        return "Author: "+this.writer + "   Title: "+this.getTitle();
    }
}
