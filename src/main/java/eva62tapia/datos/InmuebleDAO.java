package eva62tapia.datos;

import java.io.Serializable;
import java.util.List;

import eva62tapia.modelo.Inmueble;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class InmuebleDAO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext
	EntityManager em;
	
	public void insert(Inmueble inmueble) {
		em.persist(inmueble);
	}
	
	public void update(Inmueble inmueble) {
		em.merge(inmueble);
	}
	
	public Inmueble getById(int id) {
		Inmueble inmueble = em.find(Inmueble.class, id);
		return inmueble;
	}
	
	public List<Inmueble> getAll(){
		String jpql = "Select i from Inmueble i";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}

}
