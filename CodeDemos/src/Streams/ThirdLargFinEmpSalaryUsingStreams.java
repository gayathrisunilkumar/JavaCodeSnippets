package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ThirdLargFinEmpSalaryUsingStreams {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Anju","Finance",50000));
        employeeList.add(new Employee("Ajmi","Software",40000));
        employeeList.add(new Employee("Gayathri","Finance",30000));
        employeeList.add(new Employee("Nimisha","Software",20000));
        employeeList.add(new Employee("Melvin","Finance",25000));
        employeeList.add(new Employee("Vishnu","Finance",100000));

        // 100000,50000,30000,25000

        Optional<Long> thirdlargestFinEmpSalary = employeeList.stream()
                .filter(e->e.getDepartment().equalsIgnoreCase("Finance"))
                .map(Employee::getSalary)
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst();

        System.out.println(
                "thirdlargestFinEmpSalary: "+
                        (thirdlargestFinEmpSalary.isPresent()?
                                thirdlargestFinEmpSalary.get()
                                : "Insufficient no. of employees to retrieve result")
        );
    }
}
