package pro.sky.java.course1.coursework;

public class Main {

    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Ivanov Ivan Ivanovich", 10000, 1);
        employees[1] = new Employee("Ivanov Petr Ivanovich", 11000, 2);
        employees[2] = new Employee("Petrov Ivan Ivanovich", 12000, 3);
        employees[3] = new Employee("Petrov Petr Ivanovich", 13000, 4);
        employees[4] = new Employee("Sidorov Ivan Ivanovich", 14000, 5);
        employees[5] = new Employee("Sidorov Petr Ivanovich", 15000, 1);
        employees[6] = new Employee("Ivanov Ivan Petrovich", 16000, 2);
        employees[7] = new Employee("Petrov Petr Petrovich", 17000, 3);
        employees[8] = new Employee("Sidorov Ivan Petrovich", 18000, 4);
        employees[9] = new Employee("Sidorov Sidor Sidorovich", 19000, 5);

        employees[1].setSalary(20000);
        employees[1].setDepartment(5);

        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);

            }
        }
        int totalSum = getSumSalary();
        System.out.println("Общая сумма зарплаты: " + totalSum);

        int averageSalary = getAverageSalary();
        System.out.println("Средняя заработная плата: " + averageSalary);


        Employee employeeMinSalary = getMinSalary();
        System.out.println("Минимальная заработная плата: " + employeeMinSalary);

        Employee employeeMaxSalary = getMaxSalary();
        System.out.println("Максимальная заработная плата: " + employeeMaxSalary);
    }

    private static int getSumSalary() {
        int totalSum = 0;
        for (Employee employee : employees) {
            totalSum += employee.getSalary();
        }
        return totalSum;
    }

    private static Employee getMinSalary() {
        int minSalary = 10000000;
        Employee employeeMinSalary = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                employeeMinSalary = employees[i];

            }
        }
        return employeeMinSalary;


    }

    private static Employee getMaxSalary() {
        int maxSalary = 0;
        Employee employeeMaxSalary = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                employeeMaxSalary = employees[i];

            }
        }
        return employeeMaxSalary;
    }

    private static int getAverageSalary() {
        int averageSalary = 0;
        int totalSum = 0;
        for (Employee employee : employees) {
            totalSum += employee.getSalary();
            averageSalary = totalSum / employees.length;
        }
        return averageSalary;
    }
}


















