



//this class is the blueprint for a book object.
public class Book {

    private String title;
    private String author;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book(String author, String title){
        this.author=author;
        this.title=title;
    }
}
