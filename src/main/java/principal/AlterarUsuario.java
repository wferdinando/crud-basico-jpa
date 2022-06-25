package principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Usuario;

public class AlterarUsuario {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("crud-basico-jpa");
		EntityManager em = emf.createEntityManager();

		Usuario usuario = em.find(Usuario.class, 3L);
		
		if(usuario != null) {
			em.getTransaction().begin();
			usuario.setEmail("mariadasilva@gmail.com");
			em.merge(usuario);
			em.getTransaction().commit();
		}else {
			System.out.println("Usuário não encontrado!");
		}
				
		em.close();
		emf.close();
		
		
		
	}

}
