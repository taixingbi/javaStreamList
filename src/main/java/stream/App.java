package stream;

import stream.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Employee> employees = buildEmployees();
        new Stream1().process(employees);
        new Stream2().process(employees);
        new Stream3_reduce().process(employees);
    }

    static List<Employee> buildEmployees(){
        List<Employee> employees = new ArrayList<>();
        Employee employee1 =  new Employee();
        employee1.setId("1");
        employee1.setName("ht");
        employee1.setAge("40");
        employee1.setCountry("China");

        Employee employee2 =  new Employee();
        employee2.setId("2");
        employee2.setName("flora");
        employee2.setAge("0");
        employee2.setCountry("China");

        Employee employee3 =  new Employee();
        employee3.setId("3");
        employee3.setName("tony");
//        employee3.setAge("30");
        employee3.setCountry("China");

        Employee employee4 =  new Employee();
        employee4.setId("4");
        employee4.setName("ben");
        employee4.setAge("50");
        employee4.setCountry("China");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        return employees;
    }
}
