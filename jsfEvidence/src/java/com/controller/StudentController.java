/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.entity.Student;
import com.service.StudentService;
import com.serviceImp.StudentServiceImp;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author Md Yasin Arif
 */
@ManagedBean
public class StudentController {
    private Student student;
    private List<Student> students;
    private StudentService service;
    private String message;

    public void save(){
        service = new StudentServiceImp();
        service.save(student);
        FacesContext.getCurrentInstance().addMessage("MessageId", new FacesMessage(FacesMessage.SEVERITY_INFO, "Save Successfully",null));
        System.out.println("Save Successfully");
    }
    public void update(){
        service = new StudentServiceImp();
        service.update(student);
        FacesContext.getCurrentInstance().addMessage("MessageIdUp", new FacesMessage(FacesMessage.SEVERITY_INFO, "update Successfully",null));
        System.out.println("update Successfully");
    }
    public void delete(){
        service = new StudentServiceImp();
        service.delete(student);
        FacesContext.getCurrentInstance().addMessage("MessageIdUp", new FacesMessage(FacesMessage.SEVERITY_INFO, "delete Successfully",null));
        System.out.println("delete Successfully");
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

    public List<Student> getStudents() {
        students = new ArrayList<>();
        service = new StudentServiceImp();
        students = service.getStudents();
        return students;
    }

    public void setStudents(List<Student> studentsList) {
        this.students = studentsList;
    }

   

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
