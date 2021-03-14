package javaLevel1.lesson5;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Nikolaev Kolyan", "Director", 30, 500000, "89819999999", "kolyan@mail.ru");
        employee1.employeeInfo();
        System.out.println();
        printEmployeesElder40(employeesArray()); // Задача 5.
    }

    public static void printEmployeesElder40(Employee[] employees) { // Фильтрует сотрудников из массива по возрасту старьше 40 лет и выводит полную информацию о них.
        System.out.println("Employees list (elder then 40 years): ");
        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getAge() > 40) {
                employees[i].employeeInfo();
                System.out.println();
            }
        }
    }

    public static Employee[] employeesArray() { // Возвращает созданный массив с объектами типа Employee[].
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Ivanov Ivan", "director", 41, 500000, "89819998877", "ivanov222@mail.ru");
        employeesArray[1] = new Employee("Nikolay Nikolaev", "engineer", 27, 100000, "89819998871", "nikolaev222@mail.ru");
        employeesArray[2] = new Employee("Dmitry Dmitriev", "technician", 23, 50000, "89819998872", "dmitriev222@mail.ru");
        employeesArray[3] = new Employee("Sergey Sergeev", "biologist", 29, 80000, "89819998873", "sergeev222@mail.ru");
        employeesArray[4] = new Employee("Fedor Fedorov", "chemist", 46, 90000, "89819998874", "fedorov222@mail.ru");
        return employeesArray;
    }
}
