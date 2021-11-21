package pro.sky.java.course1.lesson8;

public class Main2 {


    public static void main(String[] args) {

        Author king = new Author("Стивен", "Кинг");
        Author christie = new Author("Агата", "Кристи");

        Book[] books = new Book[9];

        addBook(books, new Book("Смерть лорда Эджвера", christie, 1933));
        addBook(books, new Book("Убийства по алфавиту", christie, 1936));
        addBook(books, new Book("Смерть в облаках", christie, 1935));
        addBook(books, new Book("Мертвая зона", king, 1979));
        addBook(books, new Book("Кэрри", king, 1974));
        addBook(books, new Book("Лангольеры", king, 1990));

        for (Book book : books) {
            if (book != null) {
                printBook(book);
            }

        }
    }

    private static boolean addBook(Book[] books, Book newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                return true;
            }
        }
        return false;
    }

    private static void printBook(Book book) {
        System.out.println(book.getAuthorFullName() + ":" + book.getBookName() + ":" + book.getYear());


    }


}


