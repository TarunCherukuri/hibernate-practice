package many_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCustomer {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Customer c = new Customer(0, 216546545646l, "harsh", 7894561238l, null);
		
		et.begin();
		
		em.persist(c);
		
		
		et.commit();
		
		
	}

}
