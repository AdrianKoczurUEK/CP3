class AudioBook extends Book{
    private int minutes;

    AudioBook(String title, Writer author, int minutes, Publisher publisher,int publishYear){
        super(title,author,publisher,publishYear);
        setMinutes(minutes);
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
    public int getMinutes() {
        return minutes;
    }

    void display(){
        System.out.printf("Author: %s   Title: %s   Duration: %s min   Publisher name: %s   Publish Year: %d   \n",this.getAuthor().getName(),this.getTitle(),this.getMinutes(),
        this.getPublisher().getName(),getPublishYear());
    }
}
