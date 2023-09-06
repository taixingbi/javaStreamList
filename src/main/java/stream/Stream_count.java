package stream;


import stream.model.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class Stream_count {
    public static void main(String[] args) {
        System.out.println("----------Stream_count----------");

        List<Employee> employees = BuildEmployees.get();
        long count = employees
                .stream()
                .count();

        System.out.println("count " +  count);
    }
}


