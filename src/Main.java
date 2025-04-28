import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook();

        book.addEmployee(new Employee("Иванов Иван Иванович", 1, 17657));
        book.addEmployee(new Employee("Борисов Борис Борисович", 2, 70096));
        book.addEmployee(new Employee("Касмынина Анна Сергеевна", 3, 38457));
        book.addEmployee(new Employee("Наумова Виктория Юрьевна", 4, 68651));
        book.addEmployee(new Employee("Карпенко Кирилл Васильевич", 5, 30430));
        book.addEmployee(new Employee("Иванина Алена Викторовна", 1, 43678));
        book.addEmployee(new Employee("Петров Вячеслав Кириллович", 2, 97092));
        book.addEmployee(new Employee("Трофимова Ирина Валерьевна", 3, 90650));
        book.addEmployee(new Employee("Савушкин Петр Евстигнеевич", 5, 128670));
        book.addEmployee(new Employee("Савушкина Анастасия Геннадьевна", 2, 129670));

        book.printEmployee();
        System.out.println(book.numberOfEmployees());
        System.out.println(book.numberOfEmployeesInDepartment(2));
        System.out.println(book.calculateSalarySum());
        System.out.println(book.getMinSalaryEmployee());
        System.out.println(book.getMaxSalaryEmployee());
        System.out.println(book.getAverageMonthSum());
        book.getEmployeesFullName();
        book.getIndexedSalary();
        System.out.println(book.getMaxSalaryEmployeeInDepartment(2));
        book.sortEmployeesByDepartment(4);
        book.compareSalaryLess(100_000);
        System.out.println(book.getMinSalaryEmployeeInDepartment(2));
        System.out.println(book.getEmployeeSalarySumInDepartment(2));
        System.out.println(book.getAverageMonthSumInDepartment(2));
        book.getIndexedSalaryInDepartment(2);
        book.compareSalaryMore(100_000);
        book.getEmployeeById(10);
        System.out.println(book.deleteEmployee(2));
        book.printEmployee();
    }
}
















