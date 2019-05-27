package HW10.stramproject;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class Project {
    public static void main(String[] args) {
        String[] name={"Amir", "Hatef", "Mehran", "Mojtaba", "Mohammad", "Ali",
                "Davood", "Reza", "Mohsen"};

        List<String> strings =Arrays.asList(name);


        Map<Integer, List<String>> nameGrouping = strings.stream()
                .collect(groupingBy(String::length));

        System.out.println(nameGrouping);


    }
}
