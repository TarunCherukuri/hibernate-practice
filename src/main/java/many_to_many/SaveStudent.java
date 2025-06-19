package many_to_many;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudent {
	
	public static void main(String[] args) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		 EntityManager em = emf.createEntityManager();
		 EntityTransaction et = em.getTransaction();
		 
		 
		 Student s = new Student(0,"King", "noor@gmail.com", 9876543211l);
		 
		 et.begin();
		 
		 em.persist(s);		 
		 
		 et.commit();
		 		 
		 
		 
	}

}
