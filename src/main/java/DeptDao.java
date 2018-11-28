import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import demo.Address;
import demo.Emp;
import demo.EmpPk;
import util.HibernateUtil;

public class DeptDao {

	private static SessionFactory sf=HibernateUtil.getSessionFactory();
	
	public static void main(String[] args) {
		//DeptDao dao=new DeptDao();
		insert();
		sf.close();
	}

	public static void insert(){
		Session session=null;
		Transaction tx=null;
		try {
			session=sf.openSession();
			tx=session.beginTransaction();
			
			Emp e=new Emp();
			EmpPk epk=new EmpPk();
			Address add=new Address();
			epk.setFirstname("Rinki");
			epk.setLastname("Kumari");
			add.setCity("Pune");
			add.setLine1("Hinjiwadi");
			
			e.setAddress(add);
			e.setEmppk(epk);
			
			session.save(e);
			
			tx.commit();
		} catch (Exception e) {
			// TODO: handle exception+
			tx.rollback();
			System.out.println(e);
		}
		finally{
			session.close();
		}
	}
	
	
	}

