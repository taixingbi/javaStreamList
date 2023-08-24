package stream;


import stream.model.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
    Stream1(){
    }

    void process (List<Employee> employees ){
        System.out.println("----------Stream1----------");

        List<Employee> employeeList = employees
                .stream()
                .filter(employee -> employeeIsValid(employee))
//                .filter(employee -> employee.getId() == "40")
                .collect(Collectors.toList());

        System.out.println("employeeList " +  employeeList);
        System.out.println("----------Stream1----------\n");
    }

    boolean employeeIsValid(Employee employee) {
        if (employee.getAge() == null || employee.getAge().equals("0")){
            return false; // remove
        }
        return true; // return
    }

    String createName (Employee employee){
        return employee.getName();
    }
}


