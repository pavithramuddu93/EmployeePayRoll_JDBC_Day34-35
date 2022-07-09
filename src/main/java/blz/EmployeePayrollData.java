package blz;

import java.time.LocalDate;
import java.util.Objects;

public class EmployeePayrollData {
    int id ;
    String name;
    double salary;
    private LocalDate start;
    public EmployeePayrollData(int id, String name, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public EmployeePayrollData(int id, String name, double salary, LocalDate start) {
        this(id,name,salary);
        this.start = start;
    }


    @Override
    public int hashCode() {
        return Objects.hash(start, id, name, salary);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EmployeePayrollData other = (EmployeePayrollData) obj;
        return Objects.equals(start, other.start) && id == other.id && Objects.equals(name, other.name)
                && Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
    }
    @Override
    public String toString() {
        return "EmployeePayrollData [id=" + id + ", name=" + name + ", salary=" + salary + ", Start=" + start + "]";
    }



}