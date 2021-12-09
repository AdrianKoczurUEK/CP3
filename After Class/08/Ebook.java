class Ebook extends Book{
    private String fileName;

    Ebook(String title,Writer author, String filename, Publisher publisher,int publishYear){
        super(title, author, publisher,publishYear);
        setFileName(filename);
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String getFileName() {
        return fileName;
    }

    void display(){
        System.out.printf("Author name: %s   Title: %s   Filename: %s   Publisher name: %s   Publish Year: %d   \n",this.getAuthor().getName(),this.getTitle(),this.getFileName(),
        this.getPublisher().getName(),this.getPublishYear());
    }
}
