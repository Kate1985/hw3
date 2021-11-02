package pro.sky.java.course1.lesson5;

public class hw5 {
    private static java.lang.System System;

    //task1//
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;


    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
            // sum=sum+element;
        }
        System.out.println(sum);


        //task2
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }


        }

        System.out.println("максимальное значение " + max + ", минимальное значение " + min);


        //task3
        System.out.println("среднее значение " + sum / (float) arr.length);

        //task4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }

    }
}