package many_to_one;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
// Q1 Print bank name by bankid
public class PrintCustomerNameByBankId {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		int bid = 1;
		Query q = em.createQuery("select c from Customer c where c.b.id=1");
		
		List<Customer> list = q.getResultList();
		
		for(Customer c : list) {
			System.out.println(c);
		}
		
		
		
		
	}

}
