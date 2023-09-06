package stream;


import stream.model.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class Stream_filter {
    public static void main(String[] args) {
        System.out.println("----------Stream_filter----------");

        List<Employee> employees = BuildEmployees.get();
        List<Employee> employeeList = employees
                .stream()
                .filter(employee -> employeeIsValid(employee))
//                .filter(employee -> employee.getId() == "40")
                .collect(Collectors.toList());

        System.out.println("employeeList " +  employeeList);
    }

    static boolean employeeIsValid(Employee employee) {
        if (employee.getAge() == null || employee.getAge().equals("0")){
            return false; // remove
        }
        return true; // return
    }

    String createName (Employee employee){
        return employee.getName();
    }
}


