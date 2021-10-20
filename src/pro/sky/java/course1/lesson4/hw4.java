package pro.sky.java.course1.lesson4;

public class hw4 {

    private static java.lang.System System;

    public static void main(String[] args) {
        //task1
        int i = 1;
        while (i <= 10) {
            if (i == 10) {
                System.out.println(" " + i);
                break;
            }

            System.out.print(" " + i);
            i++;
        }

        for (int b = 10; b > 0; b--) {
            if (b == 1) {
                System.out.println(b);
                break;
            }
            System.out.print(b + " ");

        }
        //task2
        int a = 1;
        for (int A = a; A <= 31; A++) {
            if (A % 7 == a) {
                System.out.println(" Сегодня пятница " + A + " число. Необходимо подготовить отчет.");
            }
        }

        //task3
        int year = 2021;
        int yearBefore = year - 200;
        int yearAfter = year + 100;
        for (int y = yearBefore; y <= yearAfter; y++) {
            if (y % 79 == 0) {
                System.out.println(y);
            }
        }

        //task4
        for (int B = 1; B <= 30; B++) {
            System.out.print(B + " ");

            if (B % 3 == 0) {
                System.out.print("ping" + " ");
            }

            if (B % 5 == 0) {
                System.out.print("pong");
            }
            System.out.println();
        }


        //task5
        int b = 1;
        int A = 0;

        for (int num = 0; num < 5; num++) {
            System.out.print(A + " " + b + " ");
            A=A+b;
            b=A+b;
        }
    }

}

