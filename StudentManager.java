
package controllers;

import com.mycompany.day14_miniproject.models.Student;
import com.mycompany.day14_miniproject.services.StudentDataService;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private List<Student> list;
    private final String pathFileToInput; // "./resources/student-input.txt"
    private StudentDataService service;

    public StudentManager(String pathFileToInput) {

        this.pathFileToInput = pathFileToInput;

        this.service = new StudentDataService();

        try {

            this.list = service.read(pathFileToInput);

        } catch (IOException ex) {

            ex.printStackTrace();
        }
    }




    public void sortByName() {

        Collections.sort(
                list,
                (s1, s2) -> s1.getName().compareTo(s2.getName())
        );

    }

    public void sortById() {

        Collections.sort(
                list,
                (s1, s2) -> Integer.compare(s1.getId(), s2.getId())
        );

    }

    public Student findByName(String name) {

        for (Student s: list) {

            if (s.getName().equals(name)) {
                return s;
            }
        }

        return null;
    }

    public Student findById(int id) {

        for (Student s: list) {

            if (s.getId() == id) {
                return s;
            }
        }

        return null;
    }

    public void addStudent(Scanner sc) {

        list.add(new Student().input(sc));
    }

    public void editStudent(Scanner sc) {

        System.out.println("Enter id: ");

        int id = sc.nextInt();
        sc.nextLine();// ignore new line

        Student student = findById(id);
        student.edit(sc);
    }

    public void deleteStudent(Scanner sc) {

        System.out.println("Enter id: ");

        int id = sc.nextInt();
        sc.nextLine();

        Student student = findById(id);
        list.remove(student);
    }

    public void showAll() {

        for (Student s: list) {
            System.out.println(s.toString());
        }
    }
}
