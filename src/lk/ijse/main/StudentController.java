package lk.ijse.main;

import model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentController {
    @Autowired
    SessionFactory sessionFactory;

    public void savestudent(){
        Session session=sessionFactory.getCurrentSession();
        Student student=new Student(5,"vv","nm","vvnm.gmail");
        Address address=new Address("galle",123);
        address.setStudent(student);
        try {
            session.beginTransaction();
            session.save(address);
            session.getTransaction().commit();
        }finally {
            sessionFactory.close();
        }
    }
    public void getstudent(){
        Session session=sessionFactory.getCurrentSession();
        try{
            session.beginTransaction();
            Student student=session.get(Student.class,2);

            session.getTransaction().commit();
            System.out.println(student);
        }finally {
            session.close();
        }
    }
    public void updatestudent(){
        Session session=sessionFactory.getCurrentSession();
        try{
            session.beginTransaction();
            Student student=session.get(Student.class,1);
            student.setEmail("itism");

            session.getTransaction().commit();
        }finally {
            session.close();
        }
    }
    public void save_shoes(){
        Session session=sessionFactory.getCurrentSession();
        try{
            session.beginTransaction();
            Student student=new Student(29,"namal","amila","amila.gmail");
            Shoes shoes1=new Shoes("dsi");
            Shoes shoes2=new Shoes("dsi");
            Shoes shoes3=new Shoes("dsi");
            student.add(shoes1);
            student.add(shoes2);
            student.add(shoes3);

            session.save(student);
            session.getTransaction().commit();
        }finally {
            session.close();
        }
    }
    public void getshows(){
        Session session=sessionFactory.getCurrentSession();
        try{
            session.beginTransaction();
            Student student=session.get(Student.class,19);

            session.getTransaction().commit();
            System.out.println(student.getEmail());
        }finally {
            session.close();
        }
    }
    public void save_user_grou(){
        Session session=sessionFactory.getCurrentSession();
        try{
            session.beginTransaction();
            User user=new User(1,"shan","123");
            Group1 group=new Group1(1,"cis");
            User_Group user_group=new User_Group(1,34);
            user_group.setGroup(group);
            user_group.setUser(user);
            session.save(user_group);
            session.getTransaction().commit();
        }finally {
            session.close();
        }
    }
}
