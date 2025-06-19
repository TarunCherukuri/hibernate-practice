package many_to_many;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveBatch {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		 EntityManager em = emf.createEntityManager();
		 EntityTransaction et = em.getTransaction();
		 
		 Batch b = new Batch(0, "Super Java", "ADV-DDFFA-M7", null);
		 
		 et.begin();
		 
		 em.persist(b);
		 
		 
		 et.commit();
	}

}
