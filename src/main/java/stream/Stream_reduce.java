package stream;


import stream.model.Employee;

import java.util.Arrays;
import java.util.List;

public class Stream_reduce {
    Stream_reduce(){
    }

    public static void main(String[] args) {
        System.out.println("----------Stream_reduce----------");

        List<String> numbers = Arrays.asList("1", "2", "3");

        String result = numbers
                .stream()
                .reduce("", (e1, e2) ->  e1 + e2);

        System.out.println("result " +  result);
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


