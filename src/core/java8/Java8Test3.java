package core.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private long empId;
    private String name;

    public Employee(long empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Java8Test3 {

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("Arun");
//        list.add("Vijay");
//        list.add("Venkat");
//        list.add("Sonu");
//        list.add("Bhaskar");

//        for(String name : list) {
//            if(name.startsWith("V")) {
//                System.out.println(name);
//            }
//        }
       // list.stream().filter(a -> a.startsWith("V")).forEach(System.out::println);

//        list.stream().map(String::toUpperCase).forEach(System.out::println);

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101, "Pranay"));
        empList.add(new Employee(102, "Prem"));
        empList.add(new Employee(103, "Bhavani"));
        empList.add(new Employee(104, "Hari"));

//        List<String> empNameList = new ArrayList<>();
//        for(Employee e : empList) {
//            empNameList.add(e.getName());
//        }
//
//        System.out.println(empNameList);

        List<String> empNameList = empList.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println(empNameList);

    }
}
