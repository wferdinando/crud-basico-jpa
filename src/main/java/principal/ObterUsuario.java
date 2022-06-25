package principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Usuario;

public class ObterUsuario {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("crud-basico-jpa");
		EntityManager em = emf.createEntityManager();
		
		Usuario usuario = em.find(Usuario.class,3L);
				
		System.out.println("COD: " + usuario.getId());
		System.out.println("Nome: " + usuario.getNome());
		System.out.println("E-mail: " + usuario.getEmail());
		
		
		em.close();
		emf.close();
		
	}

}
