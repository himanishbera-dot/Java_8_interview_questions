package grouping;

import POJOs.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpDeptWise2ndHighestSalary {
        public static void main (String[] args){

            List<Employee> employees = Arrays.asList(
                    new Employee("Alice",  95000,"IT"),
                    new Employee("Bob", 120000,"IT"),
                    new Employee("Charlie", 120000, "IT"),
                    new Employee("David", 85000, "HR"),
                    new Employee("Amit", 70000,"IT"),
                    new Employee("Priya", 90000,"IT"),
                    new Employee("Rohit", 85000,"IT"),
                    new Employee("Rahul", 60000,"HR"),
                    new Employee("Neha", 75000, "HR"),
                    new Employee("Suresh", 120000, "HR"),
                    new Employee("Raj", 80000, "Finance"),
                    new Employee("Vikas", 95000, "Finance")
            );


            employees.stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment))
                    .forEach((dept, emp) -> {
                        Integer secondMaxSalary = emp.parallelStream().map(Employee::getSalary)
                                .distinct().sorted(Comparator.reverseOrder()).skip(1).max(Integer::compareTo).get();
                        //Comparator.comparing(Employee::getSalary).reversed()).;
                        System.out.println(dept + " Top Earner: " + emp.parallelStream()
                                .filter(employee -> employee.getSalary() == secondMaxSalary)
                                .collect(Collectors.toList()));
                    });
        }
}


