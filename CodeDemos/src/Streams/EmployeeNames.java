package Streams;

import java.util.*;

public class EmployeeNames {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Achu","Finance",100));
        employeeList.add(new Employee("Gayu","Development",20));
        employeeList.add(new Employee("Anju","IT Services",10));

        System.out.println("Employees With Salary >10: ");
        employeeList.stream()
                .filter(st->st.getSalary()>10)
                .map(Employee::getName)
                .forEach(System.out::println);
        Optional<Employee> highlyPaidEmp = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .findFirst();
        System.out.print("Highly paid employee: ");
        highlyPaidEmp.ifPresent(e->System.out.print(e.getName()+" -> "+e.getDepartment()));

    }
}
