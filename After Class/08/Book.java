class Book {
    private Writer author;
    private String title;
    private Publisher publisher;
    private int publishYear;

    Book(String title,Writer author,Publisher publisher,int publishYear){
        setAuthor(author);
        setTitle(title);
        setPublisher(publisher);
        setPublishYear(publishYear);
    }
    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }
    public int getPublishYear() {
        return publishYear;
    }
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
    public Publisher getPublisher() {
        return publisher;
    }
    public void setAuthor(Writer author) {
        this.author = author;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Writer getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }

    void display(){
        System.out.printf("Author name: %s    Title: %s   Publisher name: %s   Publish Year: %d \n",getAuthor().getName(),getTitle(),getPublisher().getName(),getPublishYear());
    }
}
