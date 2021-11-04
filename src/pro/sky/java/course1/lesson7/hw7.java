package pro.sky.java.course1.lesson7;

import java.time.LocalDate;
import java.util.Arrays;

public class hw7 {

    public static void main(String[] args) {
        printIsYearLeap(2023);
        printRecommendedVersion(2024, 1);
        System.out.println("Доставка займет " + calculateDistance(60) + " дня");
        findDuplicates("aabccddefgghiijjkk");
        int[] data = {3, 2, 1, 6, 5};
        reverseArray(data);
        System.out.println(Arrays.toString(data));
    }

    public static void printIsYearLeap(int year) {
        boolean yearIsLeap = isLeap(year);
        printIsYearLeapResult(year, yearIsLeap);
    }

    private static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void printIsYearLeapResult(int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println(year + " високосный");
        } else {
            System.out.println(year + " не високосный");

        }
    }
//  task2

    public static void printRecommendedVersion(int deviceYear, int clientOs) {
        boolean deviceIsOld = isDeviceOld(deviceYear);
        StringBuilder message = new StringBuilder();
        message.append("Установите ");
        if (deviceIsOld) {
            message.append("Lite ");
        }
        if (clientOs == 0) {
            message.append("версию для iOs");
        } else {
            message.append("версию для Android");
        }
        System.out.println(message);
    }

    private static boolean isDeviceOld(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear < currentYear;
    }

    //task3

    public static int calculateDistance(int deliveryDistance) {
        int days = 1;
        if (deliveryDistance > 20 && deliveryDistance < 60) {
            days++;
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            days++;
        }
        return days;

    }

    //task4

    public static void findDuplicates(String oneString) {
        char[] a = oneString.toCharArray();
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                System.out.println("Символ " + a[i + 1] + " дублируется");
                return;
            }
        }
        System.out.println("Дублей нет");

    }

    //task5

    public static void reverseArray(int[] ar) {
        int c = 0;
        int d = ar.length - 1;
        while (c < d) {
            int s = ar[c];
            ar[c++] = ar[d];
            ar[d--] = s;
        }

    }


}
