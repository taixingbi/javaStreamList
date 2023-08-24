package stream;


import stream.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {
    Stream2(){
    }

    void process (List<Employee> employees ){
        System.out.println("----------Stream2----------");

        List<String> nameList = employees
                .stream()
                .filter(employee -> employeeIsValid(employee))
//                .filter(employee -> employee.getId() == "40")
                .map(this::createName)
                .collect(Collectors.toList());

        System.out.println("nameList " +  nameList);
        System.out.println("----------Stream2----------\n\n\n");
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


