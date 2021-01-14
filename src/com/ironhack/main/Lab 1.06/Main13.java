package com.ironhack.main;

import java.io.FileWriter;
import java.io.IOException;

public class Main13 {
     public static void main(String[] args) throws IOException {

         Employee  employee1 = new Employee (50, "Marcos", 12324, 40);
         Employee  employee2 = new Employee (31, "Julia", 958.94, 30);
         Intern intern1 = new Intern (33,"Stephanie", 21000,11);

         employee1.addHours(25);
         employee2.addHours(12);

         System.out.println(employee1.getSalary());
         System.out.println(employee2.getSalary());
         System.out.println(employee1.getHours());
         System.out.println(employee2.getHours());
         System.out.println(intern1.getSalary());

         createEmployees ();
     }

     public static void createEmployees () throws IOException {

         int [] age = {32, 44, 56, 17, 32,47,43, 54, 57, 27};
         String [] name = {"Maria", "Juan", "Alba", "Stephen", "Joan", "Lucy", "Patricia", "Ildefonso", "Peter", "Lilian"};
         double [] salary = {12000, 12350, 11000, 25000, 45000, 21500, 22375, 25760, 23553,19878};
         double [] hours = {67,33,25,53,65,21,21,19,44,40};

         Employee [] employees = new Employee[10];

         for (int i=0; i<10;i++){
             employees [i] = new Employee (age [i], name [i], salary[i], hours [i] );
         }

         FileWriter writer = new FileWriter("employees.txt", false);
         writer.write ("Age, Name, Salary, Hours, Hired, Fired");

         for (int i=0; i<10;i++){
             writer.write ("\n" + employees [i].getAge() + ", " + employees [i].getName() + ", " + employees [i].getSalary()+", "+employees [i].getHours() + ", " +employees [i].isHired() + ", " +employees [i].isFired());
         }

         writer.close();

     }
}
