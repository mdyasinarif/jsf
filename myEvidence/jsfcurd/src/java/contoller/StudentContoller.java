/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoller;

import entity.Student;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

import service.StudentImp;

/**
 *
 * @author Md Yasin Arif
 */
@ManagedBean
public class StudentContoller {

    private  Student student;
    private List<Student> students;
    private StudentImp service;

    public void save() {
        service = new StudentImp();
        service.save(student);
        student = new Student();
        
        System.out.println("Save");
    }

    public void update() {
        service = new StudentImp();
        service.update(student);
        student = new Student();
         System.out.println("update");
    }

    public void delete() {
        service = new StudentImp();
        service.delete(student);
        System.out.println("delete");
    }

    public Student getStudent() {
        if (student == null) {
            student = new Student();
        }
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Student> getStudentsList() {
        students = new ArrayList<>();
        service = new StudentImp();
        students = service.getStudents();
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}
