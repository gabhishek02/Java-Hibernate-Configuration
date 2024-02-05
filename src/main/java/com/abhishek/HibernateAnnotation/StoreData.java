package com.abhishek.HibernateAnnotation;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;

public class StoreData {

	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	  
	SessionFactory factory = meta.getSessionFactoryBuilder().build();  
	Session session = factory.openSession();  
	org.hibernate.Transaction t = session.beginTransaction();   
	            
	    Employee e1=new Employee();    
	    e1.setId(104);    
	    e1.setName("Ajay"); 
	    e1.setEmail("ajay009@gmail.com");
	    e1.setCity("mumbai");
	      
	        
	    session.save(e1);  
	    t.commit();  
	    System.out.println("successfully saved");    
	    factory.close();  
	    session.close();

	}

}
