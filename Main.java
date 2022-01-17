
package com.mycompany.day14_miniproject;

import com.mycompany.day14_miniproject.models.Student;
import com.mycompany.day14_miniproject.services.StudentDataService;
import controllers.StudentManager;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)throws IOException {
        
        StudentDataService service = new StudentDataService();
        
        List<Student> students = service.read("./resources/student-input.txt");
        String choose = null;
        boolean exit = false;
         StudentManager studentManager = new StudentManager("./resources/student-input.txt");

        showMenu();

        while (true) {
            choose = scanner.nextLine();

            switch (choose) {
                case "1" -> {
                    System.out.println("Add student: ");
                    studentManager.addStudent(scanner);
                }
                case "2" -> {
                    System.out.println("Edit student: ");
                    studentManager.editStudent(scanner);
                }
                case "3" -> {
                    System.out.println("Delete student: ");
                    studentManager.deleteStudent(scanner);
                }
                case "4" -> {
                    System.out.println("Sort students by id ");
                    studentManager.sortById();
                }
                case "5" -> {
                    System.out.println("Sort students by name ");
                    studentManager.sortByName();
                }
                case "6" -> {
                    System.out.println("Students");
                    studentManager.showAll();
                }
                case "0" -> {
                    System.out.println("Exit");
                    exit = true;
                }
                default -> System.out.println("Invalid input!");
            }

            if (exit) {
                break;
            }

            showMenu();
        }


    }

    public static void showMenu() {
        System.out.println("-----------------Menu------------------");
        System.out.println("1. Add student");
        System.out.println("2. Edit student");
        System.out.println("3. Delete student");
        System.out.println("4. Sort students by id");
        System.out.println("5. Sort students by name");
        System.out.println("6. Show all students");
        System.out.println("0. Exit");
        System.out.println("---------------------------------------");
        System.out.println("Please choose: ");
       
        }
    
}


