package pro.sky.java.course1.lesson3;

public class Main {
    public static void main(String[] args) {
//
        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

// task 2
        int clientsOs = 1;
        int year = 2014;
        boolean isOsAndroid = clientsOs == 1;
        boolean isLiteNeeded = year < 2015;
        if (!isOsAndroid) {
            if (isLiteNeeded) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        if (isOsAndroid) {
            if (isLiteNeeded) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        //task3
        int Year = 2021;
        if ((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0)) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }


        // task4
        int deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance > 20) {
            days++;
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            days++;
            System.out.println("Доставка займет " + days + " дня");
        }

        //task5
        int monthNumber = 3;
        switch (monthNumber) {
            case 1, 2, 12: {
                System.out.println("зима");
            }
            break;

            case 3, 4, 5: {
                System.out.println("весна");
            }
            break;

            case 6, 7, 8: {
                System.out.println("лето");
            }
            break;

            case 9, 10, 11: {
                System.out.println("осень");
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
        int Age = 25;
        int Salary = 60000;
        int wantedSum = 330000;
        int maxPay = Salary / 2;
        double percent = 10;
        if (year < 23) {
            if (Salary > 80000) {
                percent = percent - 0.7 + 1;
            } else {
                percent = percent + 1;

            }
        }
        if (year < 30 && year > 23) {
            if (Salary > 80000) {
                percent = percent - 0.7 + 0.5;
            } else {
                percent = percent + 0.5;
            }
        }
        double payCreditMonth = (wantedSum * ((100 + percent) / 100) / 12);
        if (payCreditMonth > maxPay) {
            System.out.println("Максимальный платеж при ЗП " + Salary + " равен " + maxPay + " рублей. Платеж по кредиту " + payCreditMonth + "рублей. Отказано");
        } else {
            System.out.println("Максимальный платеж при ЗП " + Salary + " равен " + maxPay + " рублей. Платеж по кредиту " + payCreditMonth + "рублей. Одобрено");
        }

//
    }
}