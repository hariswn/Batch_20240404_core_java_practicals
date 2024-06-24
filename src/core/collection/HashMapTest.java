package core.collection;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class Employee implements Externalizable {


    private static final long serialVersionUID = 7484158L;

    private transient int number;
    private String name;

    public Employee(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return number == employee.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}

public class HashMapTest {

    public static void main(String[] args) {
        Map<Employee, Integer> map = new HashMap<>();
        Employee e1 = new Employee(101, "tester1");
        Employee e2 = new Employee(102, "tester2");
        Employee e3 = new Employee(103, "tester3");
        Employee e4 = new Employee(101, "tester1");
        map.put(e1, 124);
        map.put(e2, 454);
        map.put(e3, 744);
        map.put(e4, 744);

//        System.out.println(map);

        Set<Map.Entry<Employee, Integer>> etnrySet = map.entrySet();

        for(Map.Entry<Employee, Integer> entry : etnrySet) {
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }

    }
}
