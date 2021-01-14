package com.ironhack.main;

public class Employee {

    private int age;
    private String name;
    private double salary;
    private double hours;
    private boolean hired;
    private boolean fired;
    private final double hoursLimit = 60;

public void addHours (double extraHours) {

    if (this.hours + extraHours <= hoursLimit) {
        setHours(this.hours + extraHours);
    } else {
        setHours(this.hours + extraHours);
        System.out.println("Work Overload; in need of vacation!");
    }
}

public void hiring (){

    this.hired = true;
    this.fired = false;
    }

public void firing (){

    this.fired = true;
    this.hired = false;
    }

public Employee(int age, String name, double salary, double hours) {

        setAge (age);
        setName (name);
        setSalary(salary);
        setHours (hours);
        this.hired = true;
        this.fired = false;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if (this.age >= 45){
            this.salary = salary + 0.02 * salary;
        } else {
            this.salary = salary;
        }
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public boolean isHired() {
        return hired;
    }

    public void setHired(boolean hired) {
        this.hired = hired;
    }

    public boolean isFired() {
        return fired;
    }

    public void setFired(boolean fired) {
        this.fired = fired;
    }

    public double getHoursLimit() {
        return hoursLimit;
    }
}



