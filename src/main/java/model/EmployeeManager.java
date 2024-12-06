package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeManager {
	public String addEmployee(Employee E) throws Exception
	{
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		
		s.getTransaction().begin();
		s.persist(E);
		s.getTransaction().commit();
		s.close();
		sf.close();
		return "Employee data is added";
	}
	public String addRegularEmployee(RegularEmployee R) throws Exception
	{
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		
		s.getTransaction().begin();
		s.persist(R);
		s.getTransaction().commit();
		s.close();
		sf.close();
		return "Regular Employee data is added";
	}
	public String addContractEmployee(ContractEmployee C) throws Exception
	{
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		
		s.getTransaction().begin();
		s.persist(C);
		s.getTransaction().commit();
		s.close();
		sf.close();
		return "Contract Employee data is added";
	}

}
