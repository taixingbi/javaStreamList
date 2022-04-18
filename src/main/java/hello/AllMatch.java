package hello;


import java.util.ArrayList;
import java.util.List;

public class AllMatch {
    public static void main(String[] args) {
        System.out.println("----------list start----------");
        List<String> l = new ArrayList<>();
        l.add("");
        l.add("");
        l.add("");

        boolean isValid = l.stream().allMatch(s -> (s.isBlank()));

        System.out.println(isValid);

        System.out.println("----------list end----------");
    }
}


