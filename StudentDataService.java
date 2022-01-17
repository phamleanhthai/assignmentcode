
package com.mycompany.day14_miniproject.services;

import com.mycompany.day14_miniproject.models.Student;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class StudentDataService {
    
    public List<Student> read(String path) throws IOException {
        List<Student> students = new ArrayList<>();
      
       Path pathFileToRead = Paths.get(path);
        
        List<String> allLine = Files.readAllLines(pathFileToRead);
        
        for (int i = 0; i < allLine.size(); ++i) {
            String line = allLine.get(i);
            String[] data = line.split(",");
            
            Student student = new Student(Integer.parseInt(data[0]),data[1].trim(), data[2].trim(),data[3].trim());
            
            students.add(student);
        }
        
        return students;
    }
    
    public void write(String path, List<Student> students) throws IOException {
        
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < students.size(); ++i) {
            
            Student student = students.get(i);
            
            list.add(student.toString());
        }
        
        Path pathFileToWrite = Paths.get(path);
        
        Path write = Files.write(pathFileToWrite, list);
        
    }

}
