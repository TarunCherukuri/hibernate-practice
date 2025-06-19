package many_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
// print bank name by bankid
// print the person name by person id
// print bank name by customer id
// print all customer names by bank id
public class MapBankToCustomers {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		int cid1 = 4, cid2 = 5, cid3 = 6, bid =2;
		Customer c1 = em.find(Customer.class, cid1);
		Customer c2 = em.find(Customer.class, cid2);
		Customer c3 = em.find(Customer.class, cid3);
		
		Bank b = em.find(Bank.class, bid);
		
		c1.setB(b);
		c2.setB(b);
		c3.setB(b);
		
		et.begin();
		em.merge(c1);
		em.merge(c2);
		em.merge(c3);
		
		et.commit();
		
		
	}

}
