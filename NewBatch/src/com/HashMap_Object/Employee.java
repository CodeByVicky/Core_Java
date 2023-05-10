package com.HashMap_Object;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Employee {
    private String name;
    private int id;
    
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + "]";
    }


//public class Example {
   public static void main(String[] args) {
      // create HashMap with Integer as key and HashMap as value
      Map<Integer, Map<Employee, Integer>> empMap = new HashMap<>();

      // create inner HashMap with Employee class as key and Integer as value
      Map<Employee, Integer> innerMap1 = new HashMap<>();
      Employee emp1 = new Employee("John Doe", 1001);
      Employee emp2 = new Employee("Jane Smith", 1002);
      innerMap1.put(emp1, 5000);
      innerMap1.put(emp2, 6000);
      empMap.put(1, innerMap1);

      Map<Employee, Integer> innerMap2 = new HashMap<>();
      Employee emp3 = new Employee("Bob Johnson", 1003);
      Employee emp4 = new Employee("Sarah Lee", 1004);
      innerMap2.put(emp3, 7000);
      innerMap2.put(emp4, 8000);
      empMap.put(2, innerMap2);

      // print the contents of the HashMap using Iterator
      Iterator<Map.Entry<Integer, Map<Employee, Integer>>> it = empMap.entrySet().iterator();
      while (it.hasNext()) {
         Map.Entry<Integer, Map<Employee, Integer>> entry = it.next();
         Integer key = entry.getKey();
         Map<Employee, Integer> innerMap = entry.getValue();
         System.out.println("Outer HashMap Key: " + key);
         System.out.println("Inner HashMap: " + innerMap);
      }
   }
}