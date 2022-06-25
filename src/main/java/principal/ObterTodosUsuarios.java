package principal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.Usuario;

public class ObterTodosUsuarios {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("crud-basico-jpa");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "SELECT u FROM  Usuario u";
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		query.setMaxResults(5);
		
		List<Usuario> usuarios = query.getResultList();
		
		for(Usuario usuario: usuarios) {
			System.out.println("COD: " + usuario.getId());
			System.out.println("Nome: " + usuario.getNome());
			System.out.println("E-mail: " + usuario.getEmail());
			System.out.println("---------------------------------");
		}
		
		
		em.close();
		emf.close();
		
		
	}
	
}
