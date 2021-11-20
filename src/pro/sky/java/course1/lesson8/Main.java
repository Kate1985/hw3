package pro.sky.java.course1.lesson8;

public class Main {

    public static void main (String [] args) {

       Author king = new Author("Стивен","Кинг");
       Author christie = new Author("Агата","Кристи");

       Book shining = new Book("Сияние", king,1987);
       Book murderOrientExpress = new Book("Убийство в Восточном экспрессе",christie,1934);

        System.out.println("Название книги:"+ shining.getBookName()+","+" Автор:"+ shining.getAuthorFullName()+ ","+" Год издания:"+ shining.getYear());
        System.out.println("Название книги:"+ murderOrientExpress.getBookName()+","+" Автор:"+ murderOrientExpress.getAuthorFullName()+ ","+" Год издания:"+ murderOrientExpress.getYear());

        shining.setYear(1988);
        System.out.println(shining);

    }
}
