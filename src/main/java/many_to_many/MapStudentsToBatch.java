package many_to_many;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MapStudentsToBatch {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		 EntityManager em = emf.createEntityManager();
		 EntityTransaction et = em.getTransaction();
		 
		 Batch b1 = em.find(Batch.class, 1);
		 Batch b2 = em.find(Batch.class, 2);
		 Batch b3 = em.find(Batch.class, 3);
		 Batch b4 = em.find(Batch.class, 4);
		 
		 Student s1 = em.find(Student.class, 1);
		 Student s2 = em.find(Student.class, 2);
		 Student s3 = em.find(Student.class, 3);
		 
		 List<Student> sl = new ArrayList<>();
		 sl.add(s1);
		 sl.add(s2);
		 sl.add(s3);
		 
		 b1.setStudents(sl);
		 b2.setStudents(sl);
		 b3.setStudents(sl);
		 b4.setStudents(sl);
		 
		 et.begin();
		 em.merge(b1);
		 em.merge(b2);
		 em.merge(b3);
		 em.merge(b4);
		 
		 
		 
		 
		 
		 et.commit();
	}

}
