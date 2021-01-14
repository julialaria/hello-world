package com.ironhack.main;

public class Intern extends Employee{

    private final double maxSalary = 20000;

    public Intern (int age, String name, double salary, double hours) {

        super(age, name, salary, hours);

    }

    public void setSalary(double salary) {

        comprobation(salary);

        super.setSalary(salary);
    }

    public void comprobation (double salary){

        if (salary >= maxSalary){
            System.out.println("Not Valid Amount");

        }else{
            System.out.println("Valid");
        }
    }

    public double getMaxSalary() {
        return maxSalary;
    }
}
