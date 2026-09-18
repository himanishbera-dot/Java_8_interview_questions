package OOPs;

import POJOs.Employee;

import java.util.ArrayList;
import java.util.List;

public class StringOperation {
    public static void main(String[] args) {
        String s0 = " ";
        String s1 = "java";
        String s2 = "spring boot";
        String s3 = new String("");
        String s4 = new String();



        System.out.println("s0.equals(\" \") :-"+s0.equals(" "));
        System.out.println("s0.hashCode() :-"+s0.hashCode()+ " \" \".hashCode() :-"+"".hashCode());

        System.out.println("s1.equals(s2) :-"+s1.equals(s2));
        System.out.println("s1.hashCode() :-"+s1.hashCode()+ " s2.hashCode() :-"+s2.hashCode());



        System.out.println("s3.equals(s4) :-"+s3.equals(s4));
        System.out.println("s3.hashCode() :-"+s3.hashCode()+ " s4.hashCode() :-"+s4.hashCode());

        List<Employee> l1 = new ArrayList();
        Employee emp1 = new Employee("a1", 8000);
        Employee emp2 = new Employee("a1", 8000);
        Employee emp3 = new Employee("a2", 8000);

        System.out.println("emp1.equals(emp2) :-"+emp1.equals(emp2));
        System.out.println("emp1.hashCode() :-"+emp1.hashCode()+ " emp2.hashCode() :-"+emp2.hashCode());

        System.out.println("emp1.equals(emp3) :-"+emp1.equals(emp3));
        System.out.println("emp1.hashCode() :-"+emp1.hashCode()+ " emp3.hashCode() :-"+emp3.hashCode());


    }

}
