public class FictionalBook extends Book {
    protected String genre;

    public FictionalBook(){
        super();
        genre = "";
    }
    public FictionalBook(String title, String author, int year, int pages){
        super(title, author, year, pages);
        genre = "";
    }
    public FictionalBook(String title, String author, int year, int pages, String genre) {
        super(title, author, year, pages);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public Book clone(){
        Book b = super.clone();
        FictionalBook f = (FictionalBook)b;
        f.genre = this.genre;
        return f;
    }

    @Override
    public void read(){
        System.out.println("Reading for fun");
    }

    @Override
    public String toString(){
        return super.toString()+" | Genre: "+genre;
    }
}
