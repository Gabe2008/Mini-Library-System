public class Textbook extends Book {
    protected String subject;

    public Textbook(){
        super();
    }
    public Textbook(String title, String author, int year, int pages){
        super(title, author, year, pages);
    }
    public Textbook(String title, String author, int year, int pages, String subject) {
        super(title, author, year, pages);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public Book clone(){
        Book b = super.clone();
        Textbook f = (Textbook)b;
        f.subject = this.subject;
        return f;
    }

    @Override
    public void read(){
        System.out.println("Reading about "+subject);
    }

    @Override
    public String toString(){
        return super.toString()+" | Subject: "+subject;
    }
}
