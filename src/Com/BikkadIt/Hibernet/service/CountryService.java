package Com.BikkadIt.Hibernet.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Com.BikkadIt.Hibernet.model.Capital;
import Com.BikkadIt.Hibernet.model.Country;

public class CountryService {
public static void main(String[] args) {
	
	Configuration cfg = new Configuration();            //Con ctrl+space
	cfg.configure("Hiberner.CFG.xml");
	
	SessionFactory factory = cfg.buildSessionFactory();   //()| ctrl+1
	Session session = factory.openSession();
	
	Country cf=new Country();
	cf.setId(101);
	cf.setName("India");
	cf.setPM("Narendra Modi");
	
	Capital ctl=new Capital();
	ctl.setIdz(102);
	ctl.setName("Nepal");
	//ctl.setPM("rajesh shetty");
	cf.setCapital(ctl);  ///forgin key
	
	
	Transaction tx = session.beginTransaction();
	session.persist(cf);
	tx.commit();
	 session.close();
	 factory.close();
	
}
}
