/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Student;
import implementation.StudentImplementation;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import service.StudentService;

/**
 *
 * @author Md Yasin Arif
 */
@ManagedBean
public class StudentController {

    private Student student;
    private List<Student> students;
    private StudentService service;

    public void save() {
        service = new StudentImplementation();
        service.save(student);
        FacesContext.getCurrentInstance().addMessage("MessageId", new FacesMessage(FacesMessage.SEVERITY_INFO, "Save", null));
        System.out.println("Save");
    }

    public void update() {
        service = new StudentImplementation();
        service.update(student);
        FacesContext.getCurrentInstance().addMessage("MessageId", new FacesMessage(FacesMessage.SEVERITY_INFO, "update", null));
        System.out.println("update");
    }
    public void delete() {
        service = new StudentImplementation();
        service.delete(student);
        FacesContext.getCurrentInstance().addMessage("MessageId", new FacesMessage(FacesMessage.SEVERITY_INFO, "delete", null));
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
        service = new StudentImplementation();
        students = service.getStudents();
        return students;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.students = studentsList;
    }

   
}
