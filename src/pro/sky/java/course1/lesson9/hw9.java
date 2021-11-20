package pro.sky.java.course1.lesson9;

public class hw9 {
public static void main (String[ ] args){
    System.out.println("Authors: ");
    Author christie = new Author("Агата","Кристи");
    Author christie2 = new Author("Агата","Кристи");
    Author king = new Author("Стивен","Кинг");

    System.out.println("Author copies equal = " + christie.equals(christie2));
    System.out.println("Author copies equal by hashCode:  " + (christie.hashCode() == christie2.hashCode()));
    System.out.println("Author copies equal = " + christie.equals(king));
    System.out.println("Author copies equal by hashCode:  " + (christie.hashCode() == king.hashCode()));

    System.out.println(christie);
    System.out.println(king);
    System.out.println("============================================");

    System.out.println("Books: ");
    Book death = new Book("Смерть в облаках",christie,1935);
    Book death2 = new Book("Смерть в облаках",christie,1935);
    Book killingsByAlphabet = new Book("Убийства по алфавиту",christie,1936);
    System.out.println("Book copies equal: " + death.equals(death2));
    System.out.println("Book copies equal by hashCode: " + (death.hashCode() == death2.hashCode()));
    System.out.println("Book copies equal: " + death.equals(killingsByAlphabet));
    System.out.println("Book copies equal by hashCode: " + (death.hashCode() == killingsByAlphabet.hashCode()));

    System.out.println(death);
    System.out.println(killingsByAlphabet);


}
}
