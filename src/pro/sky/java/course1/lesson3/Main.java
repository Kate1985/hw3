package pro.sky.java.course1.lesson3;

public class Main {
    public static void main(String[] args) {

        int clientOs = 1;
        switch (clientOs) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
        }
// task 2
        int clientsOs = 1;
        int year = 2014;
        switch (clientsOs) {
            case 0:
                if (year < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (year < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                break;
        }
        //task3
        int Year = 2100;
        if (Year % 4 == 0 && Year % 100 != 0) {
            System.out.println("Год является високосным");
        }
        if (Year % 4 == 0 && Year % 400 == 0) {
            System.out.println("Год является високосным");
        }
        if (Year % 4 == 0 && Year % 100 == 0 && Year % 400 != 0) {
            System.out.println("Год не является високосным");
        }
        if (Year % 4 != 0) {
            System.out.println("Год не является високосным");
        }


        // task4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка займет 1 день");
        }
        if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Доставка займет 2 дня");
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Доставка займет 3 дня");
        }
        //task4 variant2
        int DeliveryDistance = 301;
        int minDistance = 20;
        int countChangeDistance = (DeliveryDistance - 20) / 40;
        if (DeliveryDistance <= minDistance) {
            System.out.println("Доставка займет " + 1 + " день");
        }
        if (DeliveryDistance > 20) {
            System.out.println("Доставка займет " + (1 + (1 + countChangeDistance) + " дней"));
        }


        //task5
        int monthNumber = 13;
        switch (monthNumber) {
            case 1: {
                System.out.println("зима");
            }
            break;
            case 2: {
                System.out.println("зима");
            }
            break;
            case 3: {
                System.out.println("весна");
            }
            break;
            case 4: {
                System.out.println("весна");
            }
            break;
            case 5: {
                System.out.println("весна");
            }
            break;
            case 6: {
                System.out.println("лето");
            }
            break;
            case 7: {
                System.out.println("лето");
            }
            break;
            case 8: {
                System.out.println("лето");
            }
            break;
            case 9: {
                System.out.println("осень");
            }
            break;
            case 10: {
                System.out.println("осень");
            }
            break;
            case 11: {
                System.out.println("осень");
            }
            break;
            case 12: {
                System.out.println("зима");
            }
            break;
        }
        if (monthNumber > 12) {
            System.out.println("такого месяца нет");
        }

        //task6
        int age = 19;
        int salary = 58000;
        if (age < 23 && salary < 50000) {
            System.out.println("мы готовы выдать вам кредитную карту с лимитом " + salary * 2 + " рублей");
        }
        if (age < 23 && salary >= 50000 && salary < 80000) {
            System.out.println("мы готовы выдать вам кредитную карту с лимитом " + salary * 2 * 1.2f + " рублей");
        }
        if (age < 23 && salary >= 80000) {
            System.out.println("мы готовы выдать вам кредитную карту с лимитом " + salary * 2 * 1.5f + " рублей");
        }
        if (age >= 23 && salary < 50000) {
            System.out.println("мы готовы выдать вам кредитную карту с лимитом " + salary * 3 + " рублей");
        }
        if (age >= 23 && salary >= 50000 && salary < 80000) {
            System.out.println("мы готовы выдать вам кредитную карту с лимитом " + salary * 3 * 1.2f + " рублей");
        }
        if (age >= 23 && salary >= 80000) {
            System.out.println("мы готовы выдать вам кредитную карту с лимитом " + salary * 3 * 1.5f + " рублей");
        }

        //task7


    }
}