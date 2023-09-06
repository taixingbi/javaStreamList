package stream;


import stream.model.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class Stream_map {
    public static void main(String[] args) {
        System.out.println("----------Stream_map----------");

        List<Employee> employees = BuildEmployees.get();

        List<String> nameList = employees
                .stream()
                .filter(employee -> employeeIsValid(employee))
//                .filter(employee -> employee.getId() == "40")
                .map(e -> createName(e))
                .collect(Collectors.toList());

        System.out.println("nameList " +  nameList);

        System.out.println(employees
                .stream().count());
    }

    static boolean employeeIsValid(Employee employee) {
        if (employee.getAge() == null || employee.getAge().equals("0")){
            return false; // remove
        }
        return true; // return
    }

    static String createName(Employee employee){
        return employee.getName();
    }
}


