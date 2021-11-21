package pro.sky.java.course1.coursework;

public class Employee {

    private final String fullName;
    private int salary;
    private int department;
    private int id;
    private static int idCounter = 1;


    public Employee(String fullName, int salary, int department) {

        this.id = idCounter;
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
        idCounter++;
    }


    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Сотрудник: " + id + ". " +
                "ФИО: " + fullName +
                " Зарплата: " + salary + " " +
                "Отдел: " + department;
    }
}








