package one_to_many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MapDistrictToState {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		int sid = 2, did1 = 5, did2 =6, did3 = 7, did4 = 8;
		State s = em.find(State.class, sid);
		District d1 = em.find(District.class, did1);
		District d2 = em.find(District.class, did2);
		District d3 = em.find(District.class, did3);
		District d4 = em.find(District.class, did4);
		
		List<District> districts = new ArrayList<>();
		districts.add(d1);
		districts.add(d2);
		districts.add(d3);
		districts.add(d4);
		s.setDistricts(districts);
		et.begin();
		em.merge(s);
		et.commit();
		
		
	}
	

}
