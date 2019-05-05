/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Student;
import java.util.List;

/**
 *
 * @author Md Yasin Arif
 */
public interface StudentService {
    void save(Student student);
    void update(Student student);
    void delete(Student student);
    List<Student> getStudents();
}
