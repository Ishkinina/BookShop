import java.util.Date;

/**
 * Created by eishkinina on 25.07.16.
 */
public class Book {
    private String author;
    private String bookName;
    private Date releaseDate;
    private String publisher;
    private int bookId;
    private float price;

    public String getAutor() {
        return author;
    }

    public String getBookName() {
        return bookName;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getBookId() {
        return bookId;
    }

    public float getPrice() {
        return price;
    }

    public void setAutor(String autor) {
        this.author = autor;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Book(String author, String bookName, float price, int bookId, String publisher, Date releaseDate) {
        this.author = author;
        this.bookName = bookName;
        this.price = price;
        this.bookId = bookId;
        this.publisher = publisher;
        this.releaseDate = releaseDate;
    }

//    public Book() {
//    }
}
