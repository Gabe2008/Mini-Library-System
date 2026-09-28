public class Manga extends Book {
    protected String genre;

    public Manga(){
        super();
        genre = "";
    }
    public Manga(String title, String author, int year, int pages){
        super(title, author, year, pages);
        genre = "";
    }
    public Manga(String title, String author, int year, int pages, String genre) {
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
        Manga f = (Manga)b;
        f.genre = this.genre;
        return f;
    }

    @Override
    public void read(){
        System.out.println("Reading right to left");
    }

    @Override
    public String toString(){
        return super.toString()+" | Genre: "+genre;
    }
}
