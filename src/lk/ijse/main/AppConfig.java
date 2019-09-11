package lk.ijse.main;

import model.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@org.springframework.context.annotation.Configuration
@ComponentScan("lk.ijse")
public class AppConfig {

    @Bean
    public SessionFactory getSessionFactory() {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cgx.xml").
                addAnnotatedClass(Student.class)
                .addAnnotatedClass(Address.class)
                .addAnnotatedClass(Shoes.class)
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(Group1.class)
                .addAnnotatedClass(User_Group.class)
                .buildSessionFactory();
        return sessionFactory;
    }
}
