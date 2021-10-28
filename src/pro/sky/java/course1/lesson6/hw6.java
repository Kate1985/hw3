package pro.sky.java.course1.lesson6;

public class hw6 {

    private static java.lang.System System;

    public static void main(String[] args) {

            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";
            String fullName = lastName + " " + firstName +" " + middleName;
            String fullNameUp = fullName.toUpperCase();
            String fullName3 = fullName.replace(" ", ";");
            String fullName1 = "Семён Семёнович Иванов";
            //String fullName11 = fullName1.replace("ё","е");
            if (fullName1.contains("ё")){
                fullName1 = fullName1.replace("ё","е");
            }
            System.out.println(fullName);
            System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameUp);
            System.out.println("Данные ФИО сотрудника для административного отдела - " + fullName3);
            System.out.println("Данные ФИО сотрудника  - " + fullName1);

        //task5

        String FullName5 = "Ivan Ivanovich Ivanov";
        int ind1 = FullName5.indexOf(" ");
        int ind2 = FullName5.lastIndexOf(" ");
        String FirstName = FullName5.substring(0, ind1);
        String MiddleName = FullName5.substring(ind1, ind2);
        String LastName = FullName5.substring(ind2);
        System.out.println("Имя сотрудника - " + FirstName);
        System.out.println("Отчество сотрудника -" + MiddleName);
        System.out.println("Фамилия сотрудника -" + LastName);

        //task 7
        String s1 = "135";
        String s2 = "246";
        StringBuilder S1 = new StringBuilder(s1);
        char[] arr = s2.toCharArray();
        char a = arr[0];
        char b = arr[1];
        char c = arr[2];
        S1.insert(1,a);
        S1.insert(3,b);
        S1.insert(5,c);
        System.out.println(S1);


    }
}