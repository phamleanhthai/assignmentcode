
package com.mycompany.day14_miniproject.models;

import java.util.Scanner;


public class Student {
    private int id;
    private String name;
    private String klass;
    private String address;
        
    private double c;
    private double english;
    private double java;
    
    public Student() {
        
    }
    
    public Student(int id, String name, String klass, String address) {
        this.id = id;
        this.name = name;
        this.klass = klass;
        this.address = address;
    }
    
    public Student input(Scanner sc) {
        
        System.out.println("Enter student id: ");
        int id = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter full name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter class: ");
        String klass = sc.nextLine();
        
        System.out.println("Enter address: ");
        String address = sc.nextLine();
        
        return new Student(id, name, klass, address);
    }
    
    public void edit(Scanner sc) {
        
        System.out.println("Enter new name: ");
        this.name = sc.nextLine();
        
        System.out.println("Enter new class: ");
        this.klass = sc.nextLine();
        
        System.out.println("Enter new address");
        this.address = sc.nextLine();
        
        
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKlass() {
        return klass;
    }

    public void setKlass(String klass) {
        this.klass = klass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    @Override
    public String toString() {
        return "student{" + "id=" + id + ", name=" + name + ", klass=" + klass + ", address=" + address + '}';
    }    
}
