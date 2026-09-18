package grouping;

import POJOs.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmpGroupByDepartment {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Alice",  95000,"IT"),
                new Employee("Bob", 60000,"HR"),
                new Employee("Charlie", 120000, "IT"),
                new Employee("David", 85000, "HR"),
                new Employee("Amit", 70000,"IT"),
                new Employee("Priya", 90000,"IT"),
                new Employee("Rohit", 85000,"IT"),
                new Employee("Rahul", 60000,"HR"),
                new Employee("Neha", 75000, "HR"),
                new Employee("Suresh", 55000, "HR"),
                new Employee("Raj", 80000, "Finance"),
                new Employee("Vikas", 95000, "Finance")
        );

        Map<String, List<Employee>> empMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        empMap.entrySet().forEach(entry -> {

             List<Employee> recordSortBySalary = entry.getValue()
                    .stream().sorted(
                            Comparator.comparingDouble(Employee::getSalary).reversed()

                    )
                    .collect(Collectors.toList());

            System.out.println(entry.getKey()+"--"+recordSortBySalary.toString());

        });

    }
}

