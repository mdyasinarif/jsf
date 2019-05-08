/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Student;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.NewHibernateUtil;

/**
 *
 * @author Md Yasin Arif
 */
public class StudentImp {
    public void save(Student student){
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sn = sf.getCurrentSession();
        Transaction tr = sn.beginTransaction();
        sn.save(student);
        tr.commit();
    }
    public void update(Student student){
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sn = sf.getCurrentSession();
        Transaction tr = sn.beginTransaction();
        sn.saveOrUpdate(student);
        tr.commit();
    }
    public void delete(Student student){
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sn = sf.getCurrentSession();
        Transaction tr = sn.beginTransaction();
        sn.delete(student);
        tr.commit();
    }
    public List <Student> getStudents(){
        List <Student> list = new ArrayList<>();
        SessionFactory sf = NewHibernateUtil.getSessionFactory();
        Session sn = sf.getCurrentSession();
        Transaction tr = sn.beginTransaction();
        list = sn.createCriteria(Student.class).list();
        tr.commit();
        return list;
    }
}
