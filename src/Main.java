import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Employee[] employee = new Employee[10];
    static int departmentNumber = 2;
    static double number = 130_000;


    public static void main(String[] args) {
        employee[0] = new Employee("Иванов Иван Иванович", 1, 17657);
        employee[1] = new Employee("Борисов Борис Борисович", 2, 70096);
        employee[2] = new Employee("Касмынина Анна Сергеевна", 3, 38457);
        employee[3] = new Employee("Наумова Виктория Юрьевна", 4, 68651);
        employee[4] = new Employee("Карпенко Кирилл Васильевич", 5, 30430);
        employee[5] = new Employee("Иванина Алена Викторовна", 1, 43678);
        employee[6] = new Employee("Петров Вячеслав Кириллович", 2, 97092);
        employee[7] = new Employee("Трофимова Ирина Валерьевна", 3, 90650);
        employee[8] = new Employee("Савушкин Петр Евстигнеевич", 5, 128670);
        employee[9] = new Employee("Савушкина Анастасия Геннадьевна", 2, 129670);
        printEmployees(employee);
        System.out.println("Общая сумма затрат на зп в месяц: " + calculateSalarySum(employee));
        System.out.println("Сотрудник с минимальной заработной платой: " +
                getMinSalaryEmployee(employee).getFullName());
        System.out.println("Сотрудник с максимальной заработной платой: " +
                getMaxSalaryEmployee(employee).getFullName());
        System.out.println("Среднее значение зп: " + getTheAverageMonthSum(employee));
        getEmployeesFullName(employee);
        getIndexedSalary(employee);
        System.out.println(numberOfEmployeesInDepartment(employee));

        System.out.println("Сотрудник с максимальной зп в отделе " + departmentNumber + ": " +
                getMaxSalaryEmployeeInDepartment(employee).getFullName());
        System.out.println("Сотрудник с миниимальной зп в отделе " + departmentNumber + ": " +
                getMinSalaryEmployeeInDepartment(employee).getFullName());
        System.out.println("Общая зп в месяц по отделу " + departmentNumber + ": " +
                getEmployeeSalarySumInDepartment(employee));
        System.out.println("Средняя зп в месяц в отделе " + departmentNumber + ": " +
                getTheAverageMonthSumInDepartment(employee));
        System.out.println();
        getIndexedSalaryInDepartment(employee);
        System.out.println();
        sortEmployeesByDepartment();
        System.out.println();
        compareSalaryLess();
        System.out.println();
        compareSalaryMore();


    }


    public static int numberOfEmployees(Employee[] employee) {
        int numberOfEmployees = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                numberOfEmployees++;

            }
        }
        return numberOfEmployees;
    }

    public static int numberOfEmployeesInDepartment(Employee[] employee) {
        int numberOfEmployeesInDepartment = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == departmentNumber) {
                numberOfEmployeesInDepartment++;
            }
        }
        return numberOfEmployeesInDepartment;
    }

    public static void printEmployees(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                System.out.println(employee[i]);
            }
        }
    }

    public static int calculateSalarySum(Employee[] employee) {
        int sum = 0;
        for (Employee employees : employee) {
            if (employees != null) {
                sum += employees.getMonthSalary();
            }
        }
        return sum;
    }

    public static Employee getMinSalaryEmployee(Employee[] employee) {
        Employee min = null;
        for (Employee employees : employee) {
            if (min == null || employees.getMonthSalary() < min.getMonthSalary()) {
                min = employees;
            }
        }
        return min;
    }

    public static Employee getMaxSalaryEmployee(Employee[] employee) {
        Employee max = null;
        for (Employee employees : employee) {
            if (max == null || employees.getMonthSalary() > max.getMonthSalary()) {
                max = employees;
            }
        }
        return max;
    }

    public static double getTheAverageMonthSum(Employee[] employee) {
        double averageMonthSum;
        averageMonthSum = (double) calculateSalarySum(employee) / numberOfEmployees(employee);

        return averageMonthSum;
    }

    public static void getEmployeesFullName(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null)
                System.out.println(employee[i].getFullName());
        }
    }

    public static void getIndexedSalary(Employee[] employee) {
        double index = 0.02;
        double indexedSalary;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                indexedSalary = employee[i].getMonthSalary() + employee[i].getMonthSalary() * index;
                System.out.println("ФИО: " + employee[i].getFullName() + ", проиндексированная зп: " +
                        indexedSalary);
            }
        }


    }

    public static Employee getMaxSalaryEmployeeInDepartment(Employee[] employee) {
        Employee maxInDepartment = null;
        for (Employee employees : employee) {
            if (employees.getDepartment() == departmentNumber) {
                if (maxInDepartment == null || employees.getMonthSalary() > maxInDepartment.getMonthSalary()) {
                    maxInDepartment = employees;
                }
            }
        }
        return maxInDepartment;
    }

    public static Employee getMinSalaryEmployeeInDepartment(Employee[] employee) {
        Employee minInDepartment = null;
        for (Employee employees : employee) {
            if (employees.getDepartment() == departmentNumber) {
                if (minInDepartment == null || employees.getMonthSalary() < minInDepartment.getMonthSalary()) {
                    minInDepartment = employees;
                }
            }
        }
        return minInDepartment;
    }

    public static int getEmployeeSalarySumInDepartment(Employee[] employee) {
        int sumInDepartment = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == departmentNumber) {
                sumInDepartment += employee[i].getMonthSalary();
            }
        }
        return sumInDepartment;
    }

    public static double getTheAverageMonthSumInDepartment(Employee[] employee) {
        double averageMonthSumInDepartment;
        averageMonthSumInDepartment = (double) getEmployeeSalarySumInDepartment(employee) /
                numberOfEmployeesInDepartment(employee);
        return averageMonthSumInDepartment;
    }

    public static void getIndexedSalaryInDepartment(Employee[] employee) {
        double index = 0.02;
        double indexedSalary;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == departmentNumber) {
                indexedSalary = employee[i].getMonthSalary() + employee[i].getMonthSalary() * index;
                System.out.println(employee[i].getDepartment() + " отдел, ФИО: " + employee[i].getFullName() + ", проиндексированная зп: " +
                        indexedSalary);
            }
        }

    }

    public static void sortEmployeesByDepartment() {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getDepartment() == departmentNumber) {
                System.out.println(employee[i].getId() + " " + employee[i].getFullName() + " " +
                        employee[i].getMonthSalary());
            }
        }
    }

    public static void compareSalaryLess() {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getMonthSalary() < number) {
                System.out.println(employee[i].getId() + " " + employee[i].getFullName() + " " +
                        employee[i].getMonthSalary());
            }
        }
    }

    public static void compareSalaryMore() {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getMonthSalary() >= number) {
                System.out.println(employee[i].getId() + " " + employee[i].getFullName() + " " +
                        employee[i].getMonthSalary());
            }
        }
    }
}
















