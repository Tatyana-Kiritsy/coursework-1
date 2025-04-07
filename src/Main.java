import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Иванов Иван Иванович", 1, 127657);
        employee[1] = new Employee("Борисов Борис Борисович", 2, 70096);
        employee[2] = new Employee("Касмынина Анна Сергеевна", 3, 38457);
        employee[3] = new Employee("Наумова Виктория Юрьевна", 4, 68651);
        employee[4] = new Employee("Карпенко Кирилл Васильевич", 5, 30430);
        employee[5] = new Employee("Иванина Алена Викторовна", 1, 43678);
        employee[6] = new Employee("Петров Вячеслав Кириллович", 2, 97092);
        employee[7] = new Employee("Трофимова Ирина Валерьевна", 3, 90650);
        employee[8] = new Employee("Савушкин Петр Евстигнеевич", 4, 128670);

        printEmployee(employee);
        System.out.println("Общая сумма затрат на зп в месяц: " + calculateSalarySum(employee));
        System.out.println("Сотрудник с минимальной заработной платой: " + getMinSalaryEmployee(employee));
        System.out.println("Сотрудник с максимальной заработной платой: " + getMaxSalaryEmployee(employee));
        System.out.println("Средняя зп в месяц: " + getTheAverageMonthSum(employee));
        getEmployeeFullName(employee);
    }


    public static void printEmployee(Employee[] employee) {
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

    public static String getMinSalaryEmployee(Employee[] employee) {
        int minSalary = 100_000;
        String employeeName = null;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                break;
            }
            if (employee[i].getMonthSalary() != 0 && minSalary > employee[i].getMonthSalary()) {
                minSalary = employee[i].getMonthSalary();
                employeeName = employee[i].getFullName();
            }
        }
        return employeeName;

    }

    public static String getMaxSalaryEmployee(Employee[] employee) {
        int maxSalary = 0;
        String employeeName = null;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                break;
            }
            if (employee[i].getMonthSalary() != 0 && maxSalary < employee[i].getMonthSalary()) {
                maxSalary = employee[i].getMonthSalary();
                employeeName = employee[i].getFullName();
            }
        }
        return employeeName;
    }

    public static double getTheAverageMonthSum(Employee[] employee) {
        int monthSalarySum = calculateSalarySum(employee);
        int numberOfPeople;
        double averageMonthSum = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                numberOfPeople = employee[i].getId();
                averageMonthSum = (double) monthSalarySum / numberOfPeople;
            }
        }
        return averageMonthSum;
    }

    public static void getEmployeeFullName(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null)
                System.out.println(employee[i].getFullName());
        }
    }

}











