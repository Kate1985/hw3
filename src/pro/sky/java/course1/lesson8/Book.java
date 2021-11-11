package pro.sky.java.course1.lesson8;

public class Book {
    private final String bookName;
    private final Author author;
    private int year;


    public Book(String bookName, Author author, int year) {
        this.bookName = bookName;
        this.author = author;
        this.year = year;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorFullName() {
        return author.getAuthorFirstName() + " " + author.getAuthorLastName();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;

    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author=" + author +
                ", year=" + year +
                '}';
    }
}
