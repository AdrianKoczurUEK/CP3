public class Chapters {
    
    private String chapterTitle;
    private int numberOfPages;
    private int startingPage;

    Chapters(String chapterTitle,int numberOfPages, int startingPage){
        setChapterTitle(chapterTitle);
        setNumberOfPages(numberOfPages);
        setStartingPage(startingPage);
    }


    public void setChapterTitle(String chapterTitle) {
        this.chapterTitle = chapterTitle;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public void setStartingPage(int startingPage) {
        this.startingPage = startingPage;
    }
    public String getChapterTitle() {
        return chapterTitle;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public int getStartingPage() {
        return startingPage;
    }

    public String toString(){

        return "Chapter title: "+getChapterTitle()+"   Number of pages: "+getNumberOfPages()+"  Staring Page: "+getStartingPage();
    }


}
