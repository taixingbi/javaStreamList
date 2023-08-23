package hello;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        System.out.println("----------start----------");

        List<Employee> employees = buildEmployees();

        List<Employee> employeeList = employees
                .stream()
                .filter(employee -> employeeIsValid(employee))
//                .filter(employee -> employee.getId() == "40")
                .collect(Collectors.toList());

        System.out.println("employeeList " +  employeeList);

        System.out.println("----------end----------");
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

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        return employees;
    }

    static boolean employeeIsValid(Employee employee) {
        if (employee.getAge() == null || employee.getAge().equals("0")){
            return false; // remove
        }
        return true; // return
    }
}


