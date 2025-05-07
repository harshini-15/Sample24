package practice.Hiber2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import OneToManyRelation.Bike;
import OneToManyRelation.Man;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory sf = cfg.buildSessionFactory();
        Session sess = sf.openSession(); 
        sess.beginTransaction();
        
       Person p = new Person();
      AadharCard ac = new AadharCard(111, "harsh", "ppy", "female",p);
       
      p.setId(101);
      p.setNickname("harshuu");
      p.setCard(ac);
      
      sess.persist(p);
      sess.persist(ac);
        
      
      sess.getTransaction().commit();  
       
     
    }
}
