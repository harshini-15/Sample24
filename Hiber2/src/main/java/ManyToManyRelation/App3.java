package ManyToManyRelation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        
	        SessionFactory sf = cfg.buildSessionFactory();
	        Session sess = sf.openSession(); 
	        sess.beginTransaction();
	        
	        Trainer tr1 = new Trainer();
	        Trainer tr2 = new Trainer();
	        Trainer tr3 = new Trainer();
	        
	        List<Trainer> trList1 = new ArrayList<>();
	        trList1.add(tr1);
	        trList1.add(tr2);

	        List<Trainer> trList2 = new ArrayList<>();
	        trList2.add(tr1);
	        trList2.add(tr3);
	        
	        List<Trainer> trList3 = new ArrayList<>();
	        trList3.add(tr2);
	        
	        List<Trainer> trList4 = new ArrayList<>();
	        trList4.add(tr2);
	        trList4.add(tr3);
	        
	        Tech tech1 = new Tech(111, "Java", trList1);
	        Tech tech2 = new Tech(222, "sql", trList2);
	        Tech tech3 = new Tech(333, "python", trList3);
	        Tech tech4 = new Tech(444, "React", trList4);

	        List<Tech> techList1 = new ArrayList<>();
	        techList1.add(tech1);
	        techList1.add(tech2);

	        List<Tech> techList2 = new ArrayList<>();
	        techList2.add(tech1);
	        techList2.add(tech3);
	        techList2.add(tech4);
	        
	        List<Tech> techList3 = new ArrayList<>();
	        techList3.add(tech2);
	        techList3.add(tech4);

	        tr1.setTrainerId(1);
	        tr1.setTrainerName("Ayush");
	        tr1.setTechList(techList1);
	        
	        tr2.setTrainerId(2);
	        tr2.setTrainerName("Deep");
	        tr2.setTechList(techList2);
	        
	        tr3.setTrainerId(3);
	        tr3.setTrainerName("Ankit");
	        tr3.setTechList(techList3);
	        
	        sess.persist(tech1);
	        sess.persist(tech2);
	        sess.persist(tech3);
	        sess.persist(tech4);
	        
	        sess.persist(tr1);
	        sess.persist(tr2);
	        sess.persist(tr3);

	        sess.getTransaction().commit();

	        
	       
	}

}
