public class Library {
    private Book[] books;

    public Library() {
        this.books = new Book[1];
    }

    public Library(Book[] books) {
        this.books = books;
    }

    public void addBook(Book book){
        Book[] newBooks = new Book[books.length+1];
        for(int i =0; i<books.length; i++){
            newBooks[i] = books[i];
        }
        newBooks[newBooks.length-1] = book;
        books = newBooks;
    }
    public void removeBook(int index){
        Book[] newBooks = new Book[books.length-1];
        for(int i =0; i<index; i++){
            newBooks[i] = books[i];
        }
        for(int i =index+1; i< books.length; i++){
            newBooks[i-1] = books[i];
        }
        books = newBooks;
    }
    public Book getBook(int index){
        return books[index];
    }
    public int findBook(String title){
        for(int i=0; i<books.length; i++){
            if(books[i].getTitle().equals(title)){
                return i;
            }
        }
        return -1;
    }
    public boolean isEmpty(){
        return  books==null||books.length == 0;
    }
    public void sortBooks(){
        for(int i=0; i<books.length-1; i++){
            int minID = i;
            for(int j=i+1; j<books.length; j++){
                if(books[j].compareTo(books[minID])<0){
                    minID = j;
                }
            }
            Book temp = books[i];
            books[i] = books[minID];
            books[minID] = temp;
        }
    }

    public  void printBooks(){
        for (Book book : books) {
            System.out.println(book + " ,");
        }
    }
}
