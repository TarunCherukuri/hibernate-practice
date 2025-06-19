package many_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBank {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Bank b = new Bank(0, "SBI", "SBI000246", "SBI2348", "HBR LAYOUT");
		
		et.begin();		
		em.persist(b);
		et.commit();
				
	}

}
