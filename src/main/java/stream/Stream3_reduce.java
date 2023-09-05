package stream;


import stream.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream3_reduce {
    Stream3_reduce(){
    }

    void process (List<Employee> employees ){
        System.out.println("----------Stream3_reduce----------");

        List<String> numbers = Arrays.asList("1", "2", "3");

        String result = numbers
                .stream()
                .reduce("", (e1, e2) ->  e1 + e2);

        System.out.println("result " +  result);
        System.out.println("----------Stream3_reduce----------\n\n\n");
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


