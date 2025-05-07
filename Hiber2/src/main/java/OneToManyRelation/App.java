package OneToManyRelation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        
	        SessionFactory sf = cfg.buildSessionFactory();
	        Session sess = sf.openSession(); 
	        sess.beginTransaction();
	        
	        Man m1= new Man();
	        
	        Bike b1 = new Bike(1001, "pulsar", 97000, m1);
	        Bike b2 = new Bike(2002, "pulsar", 77000, m1);
	        
	        List<Bike> bikeList1 = new ArrayList<Bike>();
	        bikeList1.add(b1);
	        bikeList1.add(b2);
	        
	        Man m2= new Man();
	        
	        Bike b3 = new Bike(3003, "pulsar", 67000, m2);
	        Bike b4 = new Bike(4004, "pulsar", 87000, m2);

	        List<Bike> bikeList2 = new ArrayList<Bike>();
	        bikeList2.add(b3);
	        bikeList2.add(b4);
	        
	        m1.setId(1);
	        m1.setName("Mani");
	        m1.setBikeList(bikeList1);
	        
	        m2.setId(2);
	      m2.setName("John");
	      m2.setBikeList(bikeList2);
	      
	      sess.persist(m1);
	      sess.persist(m2);

	      sess.persist(b1);
	      sess.persist(b2);
	      sess.persist(b3);
	      sess.persist(b4);

	      
	      sess.getTransaction().commit();
	       
	}

}
