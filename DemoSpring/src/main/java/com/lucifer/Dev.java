package com.lucifer;

public class Dev {
    private Laptop laptop;

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    private int age;

//    constructors
    public Dev() {
        System.out.println("Dev Constructor");
    }

    public Dev(int age) {
        this.age = age;
        System.out.println("Dev1 Constructor");
    }

    public Dev(Laptop laptop) {
        this.laptop = laptop;
        System.out.println("Dev1 Laptop Constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void build() {
        System.out.println("Working on Awesome Project");
        laptop.compile();
    }
}
