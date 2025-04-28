import java.util.Arrays;

public class EmployeeBook {
    private final Employee[] employees = new Employee[10];


    public EmployeeBook() {
    }

    public void printEmployee() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
        }
    }


    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public void getEmployeeById (int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                System.out.println(employees[i]);
            }
        }
    }
    public boolean deleteEmployee (int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                return true;
            }
        }
        return false;
    }



public int numberOfEmployees() {
    int numberOfEmployee = 0;
    for (int i = 0; i < employees.length; i++) {
        if (employees[i] != null) {
            numberOfEmployee++;
        }
    }

    return numberOfEmployee;
}

public int numberOfEmployeesInDepartment(int departmentNumber) {
    int numberOfEmployeesInDepartment = 0;
    for (int i = 0; i < employees.length; i++) {
        if (employees[i] != null && employees[i].getDepartment() == departmentNumber) {
            numberOfEmployeesInDepartment++;
        }
    }
    return numberOfEmployeesInDepartment;
}

public int calculateSalarySum() {
    int sum = 0;
    for (Employee employees : employees) {
        if (employees != null) {
            sum += employees.getMonthSalary();
        }
    }
    return sum;
}

public Employee getMinSalaryEmployee() {
    Employee min = null;
    for (Employee employees : employees) {
        if (min == null || employees.getMonthSalary() < min.getMonthSalary()) {
            min = employees;
        }
    }
    return min;
}

public Employee getMaxSalaryEmployee() {
    Employee max = null;
    for (Employee employees : employees) {
        if (max == null || employees.getMonthSalary() > max.getMonthSalary()) {
            max = employees;
        }
    }
    return max;
}

public double getAverageMonthSum() {

    return (double) calculateSalarySum() / numberOfEmployees();

}

public void getEmployeesFullName() {
    for (int i = 0; i < employees.length; i++) {
        if (employees[i] != null)
            System.out.println(employees[i].getFullName());
    }
}

public void getIndexedSalary() {
    double index = 0.02;
    double indexedSalary;
    for (int i = 0; i < employees.length; i++) {
        if (employees[i] != null) {
            indexedSalary = employees[i].getMonthSalary() + employees[i].getMonthSalary() * index;
            System.out.println("ФИО: " + employees[i].getFullName() + ", проиндексированная зп: " +
                    indexedSalary);
        }
    }


}

public Employee getMaxSalaryEmployeeInDepartment(int departmentNumber) {
    Employee maxInDepartment = null;
    for (Employee employees : employees) {
        if (employees.getDepartment() == departmentNumber) {
            if (maxInDepartment == null || employees.getMonthSalary() > maxInDepartment.getMonthSalary()) {
                maxInDepartment = employees;
            }
        }
    }
    return maxInDepartment;
}

public Employee getMinSalaryEmployeeInDepartment(int departmentNumber) {
    Employee minInDepartment = null;
    for (Employee employees : employees) {
        if (employees.getDepartment() == departmentNumber) {
            if (minInDepartment == null || employees.getMonthSalary() < minInDepartment.getMonthSalary()) {
                minInDepartment = employees;
            }
        }
    }
    return minInDepartment;
}

public int getEmployeeSalarySumInDepartment(int departmentNumber) {
    int sumInDepartment = 0;
    for (int i = 0; i < employees.length; i++) {
        if (employees[i] != null && employees[i].getDepartment() == departmentNumber) {
            sumInDepartment += employees[i].getMonthSalary();
        }
    }
    return sumInDepartment;
}

public double getAverageMonthSumInDepartment(int departmentNumber) {

    return (double) getEmployeeSalarySumInDepartment(departmentNumber) /
            numberOfEmployeesInDepartment(departmentNumber);

}

public void getIndexedSalaryInDepartment(int departmentNumber) {
    double index = 0.02;
    double indexedSalary;
    for (int i = 0; i < employees.length; i++) {
        if (employees[i] != null && employees[i].getDepartment() == departmentNumber) {
            indexedSalary = employees[i].getMonthSalary() + employees[i].getMonthSalary() * index;
            System.out.println(employees[i].getDepartment() + " отдел, ФИО: " + employees[i].getFullName() + ", проиндексированная зп: " +
                    indexedSalary);
        }
    }
}

public void sortEmployeesByDepartment(int departmentNumber) {
    for (int i = 0; i < employees.length; i++) {
        if (employees[i] != null && employees[i].getDepartment() == departmentNumber) {
            System.out.println(employees[i].getId() + " " + employees[i].getFullName() + " " +
                    employees[i].getMonthSalary());
        }
    }
}

public void compareSalaryLess(int number) {
    for (Employee value : employees) {
        if (value != null && value.getMonthSalary() < number) {
            System.out.println(value.getId() + " " + value.getFullName() + " " +
                    value.getMonthSalary());
        }
    }
}

public void compareSalaryMore(int number) {
    for (int i = 0; i < employees.length; i++) {
        if (employees[i] != null && employees[i].getMonthSalary() >= number) {
            System.out.println(employees[i].getId() + " " + employees[i].getFullName() + " " +
                    employees[i].getMonthSalary());
        }
    }
}
}

