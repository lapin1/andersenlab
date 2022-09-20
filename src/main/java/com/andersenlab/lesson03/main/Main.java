package com.andersenlab.lesson03.main;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivan@gmail.com", 54738934, 500000, 20);
        employees[1] = new Employee("Maximov Maxim", "CEO", "maxim@gmail.com", 14238934, 900000, 32);
        employees[2] = new Employee("Antonov Anton", "Tester", "anton@gmail.com", 49235023, 400000, 41);
        employees[3] = new Employee("Andreev Andrey", "Engineer", "andrey@gmail.com", 423504233, 600000, 50);
        employees[4] = new Employee("Igorev Igor", "CSO", "igor@gmail.com", 43023435, 480000, 53);

        findEmployeeByAge(employees);


    }

    public static void findEmployeeByAge(Employee[] employees) {
        for (Employee e : employees) {
           if(e.getAge() > 40){
               System.out.println(e);
           }
        }

    }
}
