import java.util.Objects;

public class Employee {
    private String fullName;
    private int department;
    private int monthSalary;
    private static int counter;
    private int id;

    public Employee(String fullName, int department, int monthSalary) {
        this.fullName = fullName;
        this.department = department;
        this.monthSalary = monthSalary;
        this.id = ++counter;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        if (department >= 1 && department <= 5) {
            this.department = department;
        }
    }

    public int getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(int monthSalary) {
        this.monthSalary = monthSalary;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && monthSalary == employee.monthSalary && id == employee.id && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, monthSalary, id);
    }

    @Override
    public String toString() {
        return id + " ФИО:" + fullName + ", отдел:" + department +
                ", заработная плата:" + monthSalary;
    }
}
