package principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Usuario;

public class InserirUsuario {

	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("crud-basico-jpa");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario1 = new Usuario("Antonio Jose", "antoniojose@gmail", "123456");
		Usuario usuario2 = new Usuario("Marcos André", "marcos@gmail", "87345035");
		Usuario usuario3 = new Usuario("Maria da Silva", "maria@gmail.com", "13456789");
		
		em.getTransaction().begin();

		em.persist(usuario1);
		em.persist(usuario2);
		em.persist(usuario3);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		
		
	}
	
}
