package blz;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import blz.EmployeePayrollData;
import blz.EmployeePayrollDBService;

public class EmployeePayrollServiceTest {
    static EmployeePayrollService employeePayrollService;

    @BeforeClass
    public static void initializeConstructor() {
        employeePayrollService = new EmployeePayrollService();
    }

    @Test
    public void printWelcomeMessage() {

        employeePayrollService.printWelcomeMessage();
    }

    @Test
    public void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEntries() {
        EmployeePayrollData[] arrayOfEmps = { new EmployeePayrollData(1, "Jeff Bezos", 100000.0),
                new EmployeePayrollData(2, "Bill Gates", 200000.0),
                new EmployeePayrollData(3, "Mark Zuckerberg", 300000.0) };
        employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmps));
        employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
        employeePayrollService.printData(EmployeePayrollService.IOService.FILE_IO);
        long entriess = employeePayrollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
        Assert.assertEquals(3, entriess);
    }

    @Test
    public void givenFileOnReadingFileShouldMatchEmployeeCount() {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        List<EmployeePayrollData> entries = employeePayrollService
                .readPayrollData(EmployeePayrollService.IOService.FILE_IO);
    }

}