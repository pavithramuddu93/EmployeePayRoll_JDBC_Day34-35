package blz;
import java.time.LocalDate;

public class EmployeePayrollData {
    /*
     * creating variables
     */
    private int id;
    private String name;
    private double salary;
    private LocalDate Start;

    /*
     * created constructor
     */
    public EmployeePayrollData(int id, String name, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /*
     * created constructor
     */
    public EmployeePayrollData(int id, String name, double salary, LocalDate start) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
        Start = start;
    }

    /*
     * to print method to display
     */
    @Override
    public String toString() {
        return "EmployeePayrollData [id=" + id + ", name=" + name + ", salary=" + salary + ", Start=" + Start + "]";
    }

}