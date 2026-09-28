public abstract class Book implements Comparable<Book>, Cloneable{
    protected String title;
    protected String author;
    protected int year;
    protected int pages;

    public Book() {
        title = "";
        author = "";
        year = 0;
        pages = 0;
    }

    public Book(String title, String author, int year, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    public  String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    public abstract void read();

    @Override
    public String toString() {
        return title+" by "+author;
    }

    @Override
    public boolean equals(Object o) {
        if(o==null){
            return false;
        }
        if(o==this){
            return true;
        }
        if(o.getClass()!=this.getClass()){
            return  false;
        }
        return this.getTitle().equals(((Book)o).getTitle())&&this.getAuthor().equals(((Book)o).getAuthor());
    }

    @Override
    public Book clone(){
        Book b=null;
        try {
            b = (Book) super.clone();
            b.title = this.title;
            b.author = this.author;
            b.year = this.year;
            b.pages = this.pages;
        } catch (CloneNotSupportedException e) {
            //never fires
        }
        return b;
    }

    @Override
    public int compareTo(Book o) {
        int compare = this.getTitle().compareTo(o.getTitle());
        if(compare!=0){
            return compare;
        } else {
            return this.getAuthor().compareTo(o.getAuthor());
        }
    }
}
